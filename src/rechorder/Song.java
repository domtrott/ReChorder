package rechorder;

import java.util.ArrayList;
import java.util.List;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

public class Song extends GenericJson{
	@Key("authors")
	private List<Author> authors;
	
	public List<Author> getAuthors(){
		return authors;
	}
	
	@Key("body")
	private String chordString;
	
	private List<Chords> chords = chordFinder(chordString);

	private List<Chords> chordFinder(String chordString) {
		boolean isChord = false;
		ArrayList<Chords> chords = new ArrayList<Chords>();
		for(int i = 0; i < chordString.length(); i++){
			char c = chordString.charAt(i);
			if(isChord){
				if(c == ']'){
					isChord = false;
				}
				else{
					
				}
			}
			if(c == '['){
				isChord = true;
			}
		}
		
		return chords;
	}
}