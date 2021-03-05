import java.util.ArrayList;
/**
 * Album Class.
 * @author Willis
 * Updated 3/5/2021
 */
public class Album {

	private ArrayList<Song> contents = new ArrayList<Song>();
	private String name, artist;
	private int length;
	
	/**
	 * Default constructor.
	 */
	Album() {
		this.contents = null;
		this.name = null;
		this.artist = null;
		this.length = 0;
	}
	
	/**
	 * Three-arg constructor.
	 * @param name of album.
	 * @param artist of album.
	 * @param songs in album.
	 */
	Album(String name, String artist, ArrayList<Song> songs) {
		this.contents = songs;
		this.artist = artist;
		this.name = name;
		int temp = 0;
		for (Song song : songs) {
			temp += song.getLength();
		}
		this.length = temp;
	}
	
	/**
	 * Name getter.
	 * @return name attribute.
	 */
	String getName() {
		return this.name;
	}
	
	/**
	 * Artist getter.
	 * @return artist attribute.
	 */
	String getArtist() {
		return this.artist;
	}
	
}
