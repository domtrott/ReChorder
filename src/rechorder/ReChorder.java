package rechorder;

import java.io.IOException;

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
	
	public static void main(String[] args) {
		refresh();
	}
	
	private static void refresh(){
		try {
			HttpRequestFactory requestFactory = HTTP_TRANSPORT.createRequestFactory();
			HttpRequest request = requestFactory.buildGetRequest(new GenericUrl(URL+"The%20Beatles"));
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
					System.out.println("Found song");
					System.out.println("Number of chords: " + song.getChords().size());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}














