import java.util.ArrayList;
/**
 * Playlist class.
 * @author Willis
 * Updated 3/5/2021
 */
public class Playlist {
	
	private ArrayList<Song> play = new ArrayList<Song>();
	private String name;
	private int length;
	
	/**
	 * Default constructor.
	 */
	Playlist() {
		this.name = "Untitled";
		this.length = 0;
	}
	
	/**
	 * Copy constructor.
	 * @param play
	 */
	Playlist(Playlist play) {
		this.play = play.getPlay();
		this.name = play.getName();
		this.length = play.getLength();
	}
	
	/**
	 * One-arg constructor.
	 * @param name of playlist.
	 */
	Playlist(String name) {
		this.name = name;
		this.length = 0;
	}
	
	/**
	 * Add new song to playlist.
	 * @param newSong is song to be added to playlist.
	 */
	void add(Song newSong) {
		play.add(newSong);
		length += newSong.getLength();
	}
	
	/**
	 * 
	 * @param next
	 * @return
	 */
	boolean add(Song next, int position) {
		try {
			play.add(position, next);
			length += next.getLength();
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
		length -= removal.getLength();
		return play.remove(removal);
	}
	
	/**
	 * Name getter.
	 * @return name as a string.
	 */
	String getName() {
		return this.name;
	}
	
	/**
	 * Length getter.
	 * @return
	 */
	int getLength() {
		return this.length;
	}
	
	/**
	 * 
	 * @return
	 */
	String lengthFormatter() {
		return TimeDisplay.getTime(this.length);
	}
	
	/**
	 * Playlist getter for copy constructor.
	 * @return play arraylist.
	 */
	private ArrayList<Song> getPlay() {
		return this.play;
	}
	
	/**
	 * Default print statement.
	 */
	@Override
	public String toString() {
		String temp = "";
		for (int i = 0; i < this.getPlay().size(); i++) {
			temp += i + " " + this.getPlay().get(i) + "/n";
		}
		return temp;
	}
	
}
