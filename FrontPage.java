package gui;
import javax.swing.JPanel;
import javax.swing.JButton;
/**
 * Front Page class.
 * @author Willis
 * Updated 3/9/2021
 */
public class FrontPage extends Page {
	
	private static final long serialVersionUID = 1L;
	private JPanel front;
	private JButton playlists;
	private JButton albums;
	private JButton artists;
	private JButton songs;
	private JButton genres;
	
	/**
	 * Default GUI constructor for Front Page.
	 */
	public FrontPage() {
		super();
		
		
		
		pack();
	}
	
}
