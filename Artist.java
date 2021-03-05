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
	
	
	
}
