import java.util.ArrayList;
/**
 * Artist class.
 * @author Willis
 * Updated 3/5/2021
 */
public class Artist {

	private ArrayList<Song> songs = new ArrayList<>();
	private ArrayList<Album> albums = new ArrayList<>();
	private String name;
	
	/**
	 * Default constructor.
	 */
	Artist() {
		this.songs = null;
		this.albums = null;
		this.name = null;
	}
	
	/**
	 * Copy constructor.
	 * @param artist to be copied.
	 */
	Artist(Artist artist) {
		this.songs = artist.getSongs();
		this.albums = artist.getAlbums();
		this.name = artist.getName();
	}
	
	/**
	 * One-arg constructor.
	 * @param name of artist.
	 */
	Artist(String name) {
		this.name = name;
		this.albums = null;
		this.songs = null;
	}
	
	/**
	 * Three-arg constructor.
	 * @param name of artist.
	 * @param albums of artist.
	 * @param songs by artist.
	 */
	Artist(String name, ArrayList<Album> albums, ArrayList<Song> songs) {
		this.name = name;
		this.songs = songs;
		this.albums = albums;
	}
	
	/**
	 * Name getter.
	 * @return name of artist.
	 */
	String getName() {
		return this.name;
	}
	
	/**
	 * Remove song from artist's repertoire.
	 * @param song to be removed.
	 * @return whether song could be removed.
	 */
	boolean remove(Song song) {
		try {
			songs.remove(song);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	/**
	 * Remove album from artist's repertoire.
	 * @param album to be removed.
	 * @return whether the album could be removed.
	 */
	boolean remove(Album album) {
		try {
			albums.remove(album);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	/**
	 * Song arraylist getter for copy constructor.
	 * @return arraylist of all songs in artist repertoire.
	 */
	private ArrayList<Song> getSongs() {
		return this.songs;
	}
	
	/**
	 * Album arraylist getter for copy constructor.
	 * @return arraylist of all albums in artist repertoire.
	 */
	private ArrayList<Album> getAlbums() {
		return this.albums;
	}
	
	/**
	 * Default print statement.
	 */
	@Override
	public String toString() {
		String temp = this.getName();
		for (Song song : this.songs) {
			temp += song.toString() + "/n";
		}
		return temp;
	}
	
	
}
