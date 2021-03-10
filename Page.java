package gui;
import javax.swing.JFrame;
/**
 * Page class for all GUI pages in this project.
 * @author Willis
 * Updated 3/9/2021
 */
public class Page extends JFrame{

	private static final long serialVersionUID = 1L;
	
	/**
	 * Default constructor.
	 */
	Page() {
		setTitle("Music Player");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		

		setLocationRelativeTo(null);
	}
	
}
