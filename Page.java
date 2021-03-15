package gui;
import javax.swing.JFrame;
import javax.swing.JTextField;
/**
 * Page class for all GUI pages in this project.
 * @author Willis
 * Updated 3/9/2021
 */
public class Page extends JFrame{

	private static final long serialVersionUID = 1L;
	private JTextField search;
	
	/**
	 * Default constructor.
	 */
	Page() {
		setTitle("Music Player");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		

		setLocationRelativeTo(null);
	}
	
}
