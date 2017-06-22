package rechorder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
	private static int[][] uniProbs = new int[Chords.CHORD_NUMBER][Chords.CHORD_NUMBER];
	private static int[][][] biProbs = new int[Chords.CHORD_NUMBER][Chords.CHORD_NUMBER][Chords.CHORD_NUMBER];
	private static int[][] posProbs = new int[phraseLength][Chords.CHORD_NUMBER];
	
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
	}
	
	private static List<Integer> generateSequence(int length){
		for(int i = 0; i < length; i++){
			
		}
		return null;
	}
	
	private static void refresh(){
		try {
			HttpRequestFactory requestFactory = HTTP_TRANSPORT.createRequestFactory();
			HttpRequest request = requestFactory.buildGetRequest(new GenericUrl(URL+"Queen"));
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
			for(int j : posProbs[i]){
				total += j;
			}
			for(int j = 0; j < posProbs[i].length; j++){
				posProbs[i][j] /= total;
			}
		}
		for(int i = 0; i < uniProbs.length; i++){
			double total = 0;
			for(int j : uniProbs[i]){
				total += j;
			}
			for(int j = 0; j < uniProbs[i].length; j++){
				uniProbs[i][j] /= total;
			}
		}
		for(int i = 0; i < biProbs.length; i++){
			double total = 0;
			for(int j = 0; j < biProbs[i].length; j++){
				for(int k : biProbs[i][j]){
					total += k;
				}
				for(int k = 0; k < biProbs[i][j].length; k++){
					biProbs[i][j][k] /= total;
				}
			}
			
		}
	}
}














