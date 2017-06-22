package rechorder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonObjectParser;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.json.JsonFactory;

public class ReChorder {

	private static final String KEY = "c045b8ee6df977bcda033b8b2f7090ae08b93cd3";
	private static final String URL = "http://api.guitarparty.com/v2/songs/?query=";
	private static final HttpTransport HTTP_TRANSPORT = new NetHttpTransport();
	private static final JsonFactory JSON_FACTORY = new JacksonFactory();
	private static int phraseLength = 4;
	private static double[][] uniProbs = new double[Chords.CHORD_NUMBER][Chords.CHORD_NUMBER];
	private static double[][][] biProbs = new double[Chords.CHORD_NUMBER][Chords.CHORD_NUMBER][Chords.CHORD_NUMBER];
	private static double[][] posProbs = new double[phraseLength][Chords.CHORD_NUMBER];
	
	public static void main(String[] args) {
		for(int i = 0; i < Chords.CHORD_NUMBER; i++){
			for(int j = 0; j < Chords.CHORD_NUMBER; j++){
				uniProbs[i][j] = 0;
				for(int k = 0; k < Chords.CHORD_NUMBER; k++){
					biProbs[i][j][k] = 0;
				}
			}
		}
		for(int i = 0; i < phraseLength; i++){
			for(int j = 0; j < Chords.CHORD_NUMBER; j++){
				posProbs[i][j] = 0;
			}
		}
		refresh();
		ArrayList<Integer> sequence = (ArrayList<Integer>) generateSequence(8);
		for(Integer i : sequence){
			System.out.println("Chord: " + i);
		}
	}
	
	private static List<Integer> generateSequence(int length){
		ArrayList<Integer> sequence = new ArrayList<Integer>();
		Random r = new Random();
		
		//First Chord
		double p = r.nextDouble();
		for(int i = 0; i < Chords.CHORD_NUMBER; i++){
			if(posProbs[0][i] >= p){
				System.out.println("Chord: " + i + ", Probability: " + posProbs[0][i]);
				sequence.add(i);
				break;
			}
			else{
				p -= posProbs[0][i];
			}
		}
		
		//Second Chord
		p = r.nextDouble();
		double q  = r.nextDouble();
		for(int i = 0; i < Chords.CHORD_NUMBER; i++){
			if(posProbs[1][i] + uniProbs[sequence.get(0)][i] >= p + q){
				System.out.println("Chord: " + i + ", Probability: " + (posProbs[1][i] + uniProbs[sequence.get(0)][i])/2);
				sequence.add(i);
				break;
			}
			else{
				p -= posProbs[1][i];
				q -= uniProbs[sequence.get(0)][i];
			}
		}
		
		//Other Chords
		for(int n = 2; n < length; n++){
			p = r.nextDouble();
			q  = r.nextDouble();
			double s = r.nextDouble();
			for(int i = 0; i < Chords.CHORD_NUMBER; i++){
				System.out.println("n: " + n + ", i: " + i);
				if(posProbs[n%phraseLength][i] + uniProbs[sequence.get(n-1)][i] + biProbs[sequence.get(n-2)][sequence.get(n-1)][i] >= p + q + s){
					System.out.println("Chord: " + i + ", Probability: " + (posProbs[n%phraseLength][i] + uniProbs[sequence.get(n-1)][i] + biProbs[sequence.get(n-2)][sequence.get(n-1)][i])/3);
					sequence.add(i);
					break;
				}
				else{
					p -= posProbs[n%phraseLength][i];
					q -= uniProbs[sequence.get(n-1)][i];
					s -= biProbs[sequence.get(n-2)][sequence.get(n-1)][i];
				}
			}
		}
		return sequence;
	}
	
	private static void refresh(){
		try {
			HttpRequestFactory requestFactory = HTTP_TRANSPORT.createRequestFactory();
			HttpRequest request = requestFactory.buildGetRequest(new GenericUrl(URL+"Katy Perry"));
			request.setParser(new JsonObjectParser(JSON_FACTORY));
			HttpHeaders headers = new HttpHeaders();
		    headers.set("Guitarparty-Api-Key", KEY);
		    request.setHeaders(headers);
		    HttpResponse response = request.execute();
//		    System.out.println(response.parseAsString());
		    parseResponse(response);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void parseResponse(HttpResponse response){
		try {
			SongFeed feed = response.parseAs(SongFeed.class);
			if (feed.getSongs().isEmpty()) {
				System.out.println("No activities found.");
			} else {
				for (Song song : feed.getSongs()) {
					System.out.println("Found song: " + song.getTitle());
					System.out.println("Number of chords: " + song.getChords().size());
					addToTables(song);
				}
			}
			sortProbs();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void addToTables(Song song) {
		ArrayList<Integer> chords = (ArrayList<Integer>) song.getChords();
		for(int i = 0; i < chords.size(); i++){
			posProbs[i%phraseLength][chords.get(i)] += 1;
			if(i+1 < chords.size() && !chords.get(i+1).equals(Chords.INVALID)){
				uniProbs[chords.get(i)][chords.get(i+1)] += 1;
				if(i+2 < chords.size() && !chords.get(i+2).equals(Chords.INVALID)){
					biProbs[chords.get(i)][chords.get(i+1)][chords.get(i+2)] += 1;
				}
			}
		}
	}
	
	private static void sortProbs() {
		for(int i = 0; i < phraseLength; i++){
			double total = 0;
			for(int j = 0; j < posProbs[i].length; j++){
				if(posProbs[i][j] == 0){
					posProbs[i][j] = 0.1;
					total += 0.1;
				}
				else{
					total += posProbs[i][j];
				}
			}
			for(int j = 0; j < posProbs[i].length; j++){
				posProbs[i][j] /= total;
			}
		}
		for(int i = 0; i < uniProbs.length; i++){
			double total = 0;
			for(int j = 0; j < uniProbs[i].length; j++){
				if(uniProbs[i][j] == 0){
					uniProbs[i][j] = 0.1;
					total += 0.1;
				}
				else{
					total += uniProbs[i][j];
				}
			}
			for(int j = 0; j < uniProbs[i].length; j++){
				uniProbs[i][j] /= total;
			}
		}
		for(int i = 0; i < biProbs.length; i++){
			double total = 0;
			for(int j = 0; j < biProbs[i].length; j++){
				for(int k = 0; k < biProbs[i][j].length; k++){
					if(biProbs[i][j][k] == 0){
						biProbs[i][j][k] = 0.1;
						total += 0.1;
					}
					else{
						total += biProbs[i][j][k];
					}
				}
				for(int k = 0; k < biProbs[i][j].length; k++){
					biProbs[i][j][k] /= total;
				}
			}
			
		}
	}
}














