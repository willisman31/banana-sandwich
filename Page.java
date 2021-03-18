package gui;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JButton;
/**
 * Page class for all GUI pages in this project.
 * @author Willis
 * Updated 3/18/2021
 */
public class Page extends JFrame{

	private static final long serialVersionUID = 1L;
	private JTextField search;
	private JPanel header, main, buttons;
	private JButton play, pause, skip, reverse;
	
	/**
	 * Default constructor.
	 */
	Page() {
		setTitle("Music Player");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		

		setLocationRelativeTo(null);
	}
	
}
