package rechorder;

import java.util.List;

import com.google.api.client.util.Key;

public class SongFeed{
	@Key("objects")
	private List<Song> songs;
	
	public List<Song> getSongs(){
		return songs;
	}
}