package logic;

/**
 * Song Class.
 * @author Willis
 * Updated 3/18/2021
 */
public class Song {

	// What attributes would a song have?
	private int length; // in seconds
	private boolean like; // does the user like the song
	private Artist artist;
	private Album album;
	private String title, filePath;
	private Genre genre;
	
	
	/**
	 * Default constructor
	 */
	protected Song() {
		length = 0;
		genre = null;
		artist = null;
		album = null;
		title = null;
		like = false;
		filePath = null;
	}
	
	/**
	 * Three-arg constructor.
	 * @param length of song in seconds.
	 * @param title of song.
	 * @param filePath to song.
	 */
	public Song(String title, int length, String filePath) {
		// TODO
		this.length = length;
		this.title = new String(title);
		this.genre = null;
		this.artist = new Artist();
		this.album = null;
		this.like = false;
		this.filePath = new String(filePath);
	}
	
	/**
	 * Five-arg constructor.
	 * @param title of song.
	 * @param artist of song.
	 * @param album of song.
	 * @param length of song in seconds.
	 * @param filePath to song.
	 */
	public Song(String title, Artist artist, Album album, int length, String filePath) {
		// TODO
		this.title = new String(title);
		this.artist = new Artist(artist);
		this.album = new Album(album);
		this.length = length;
		this.filePath = new String(filePath);
		this.genre = null;
		this.like = false;
	}
	
	/**
	 * Six-arg constructor.
	 * @param title of song.
	 * @param artist of song.
	 * @param album of song.
	 * @param genre of song.
	 * @param length of song in seconds.
	 * @param filePath to song.
	 */
	public Song(String title, Artist artist, Album album, Genre genre, int length, String filePath) {
		// TODO
		this.title = new String(title);
		this.artist = new Artist(artist);
		this.album = new Album(album);
		this.genre = genre;
		this.length = length;
		this.filePath = new String(filePath);
		this.like = false;
	}
	
	/**
	 * Title getter.
	 * @return title attribute.
	 */
	public String getTitle() {
		return this.title;
	}
	
	/**
	 * Artist getter.
	 * @return artist attribute.
	 */
	public Artist getArtist() {
		return this.artist;
	}
	
	/**
	 * Album getter.
	 * @return album attribute.
	 */
	public Album getAlbum() {
		return this.album;
	}
	
	/**
	 * Genre getter.
	 * @return genre attribute.
	 */
	public Genre getGenre() {
		return this.genre;
	}
	
	/**
	 * Length getter.
	 * @return length attribute.
	 */
	public int getLength() {
		return this.length;
	}
	
	/**
	 * Like getter.
	 * @return like attribute.
	 */
	public boolean getLike() {
		return this.like;
	}
	
	/**
	 * FilePath getter.
	 * @return filePath attribute.
	 */
	protected String getFilePath() {
		return this.filePath;
	}
	
	/**
	 * filePath setter.
	 * @param filePath
	 */
	protected void setFilePath(String filePath) {
		this.title = new String(filePath);
	}
	
	/**
	 * Like this song.  Sets like attribute to true.
	 */
	public void like() {
		this.like = true;
	}
	
	// TODO
	public void play() {}
	// TODO
	public void pause() {}
	// TODO
	public void skip() {}
	// TODO
	public void reverse() {}
	
	
	/**
	 * Default print statement.
	 */
	public String toString() {
		String temp = this.getTitle() + "/t/t/t";
		temp += TimeDisplay.getTime(this.getLength());
		return temp;
	}
	
}
