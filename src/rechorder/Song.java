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
	
	@Key("title")
	private String title;
	
	public String getTitle(){
		return title;
	}
	
	@Key("body")
	private String chordString;

	private List<Integer> chorder(String chordString) {
		boolean isChord = false;
		ArrayList<Integer> chords = new ArrayList<Integer>();
		String currentChord = "";
		for(int i = 0; i < chordString.length(); i++){
			char c = chordString.charAt(i);
			if(isChord){
				if(c == ']'){
					isChord = false;
					int newChord = Chords.chordNumber(currentChord);
					if(newChord == Chords.INVALID){
						System.out.println("Invalid chord found: " + currentChord);
//						return chords;
					}
					else{
						chords.add(newChord);
					}
					currentChord = "";
				}
				else if(c == '/'){
					isChord = false;
					int newChord = Chords.chordNumber(currentChord);
					if(newChord == Chords.INVALID){
						System.out.println("Invalid chord found: " + currentChord);
						return chords;
					}
					else{
						chords.add(newChord);
						currentChord = "";
					}
					while(c != ']'){
						i++;
						c = chordString.charAt(i);
					}
				}
				else{
					currentChord += c;
				}
			}
			else if(c == '['){
				isChord = true;
			}
		}
		
		return chords;
	}
	
	public List<Integer> getChords(){
		return chorder(chordString);
	}
}