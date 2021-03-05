import java.util.ArrayList;
/**
 * Playlist class.
 * @author Willis
 * Updated 3/5/2021
 */
public class Playlist {
	
	private ArrayList<Song> play = new ArrayList<Song>();
	private String name;
	
	/**
	 * Default constructor.
	 */
	Playlist() {
		
	}
	
	/**
	 * One-arg constructor.
	 * @param name of playlist.
	 */
	Playlist(String name) {
		this.name = name;
	}
	
	/**
	 * Add new song to playlist.
	 * @param newSong is song to be added to playlist.
	 */
	void add(Song newSong) {
		play.add(newSong);
	}
	
	/**
	 * 
	 * @param next
	 * @return
	 */
	boolean add(Song next, int position) {
		try {
			play.add(position, next);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	
	/**
	 * 
	 * @param removal
	 * @return
	 */
	boolean remove(Song removal) {
		return play.remove(removal);
	}
	
	/**
	 * Name getter.
	 * @return name as a string.
	 */
	String getName() {
		return this.name;
	}
}
