package LinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Album {

	private String name;
	private String artist;
	private ArrayList<Song> songList; // = new ArrayList<Song>();

	private Iterator<Song> iterator = songList.iterator();

	public Album(String name, String artist) {
		super();
		this.name = name;
		this.artist = artist;
		this.songList = new ArrayList<Song>();
	}

	public boolean addSong(String title, double duration) {
		if (findSong(title) == null) {
			System.out.println(" Adding song");
			songList.add(new Song(title, duration));
			return true;
		}
		return false;
	}

	private Song findSongs(String title) {
		for(Song checkedSong:this.songList) {
			if (checkedSong.getTitle().equals(title)) {
	return checkedSong;
	
}
		}
		return null;
	}

	private String findSong(String title) {
		while (iterator.hasNext()) {
			for (Song checkedSong : this.songList) {

				if (checkedSong.getTitle().equals(title)) {
					return checkedSong.getTitle();

				}
				
			}
		}
		return null;

	}
	public boolean addToPlayList(int trackNo,LinkedList<Song> playList)
	{
		int index=trackNo-1;
		if (index>=0 && index<playList.size()) {
			playList.add(this.songList.get(	index));
			return true;
		}
		return false;
	}
	
	public boolean addToPlayList(String songTitle,LinkedList<Song> playList) {
		
		 Song checkedSong= findSongs(songTitle);	
		 if (checkedSong!=null) {
			 
			 playList.add(checkedSong);
			 return true;
			
		}
		 return false;
		 
	}

}
