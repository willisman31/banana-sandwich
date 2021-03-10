package logic;
import java.util.ArrayList;
/**
 * Album Class.
 * @author Willis
 * Updated 3/5/2021
 */
public class Album {

	private ArrayList<Song> contents = new ArrayList<Song>();
	private String name; 
	private Artist artist;
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
	 * Copy constructor.
	 * @param album to be copied.
	 */
	Album(Album album) {
		this.contents = album.getContents();
		this.artist = album.getArtist();
		this.name = album.getName();
		this.length = album.getLength();
	}
	
	/**
	 * Three-arg constructor.
	 * @param name of album.
	 * @param artist of album.
	 * @param songs in album.
	 */
	Album(String name, Artist artist, ArrayList<Song> songs) {
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
	Artist getArtist() {
		return this.artist;
	}
	
	/**
	 * Length getter.
	 * @return unformatted length.
	 */
	int getLength() {
		return this.length;
	}
	
	/**
	 * Formats album length.
	 * @return formatted album length.
	 */
	String getFormattedLength() {
		return TimeDisplay.getTime(this.length);
	}
	
	/**
	 * Add song to album.
	 * @param song to be added.
	 * @return whether add was successful.
	 */
	boolean add(Song song) {
		try {
			contents.add(song);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	/**
	 * ArrayList getter for all songs in album.
	 * @return all songs in album.
	 */
	private ArrayList<Song> getContents() {
		return this.contents;
	}
	
	/**
	 * Default print statement.
	 */
	public String toString() {
		String temp = this.getName();
		for (Song song : this.contents) {
			temp += song.toString() + "/n";
		}
		return temp;
	}
	
}
