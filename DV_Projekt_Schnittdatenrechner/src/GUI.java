import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JDesktopPane;
import javax.swing.SwingConstants;
import net.miginfocom.swing.MigLayout;
import java.awt.CardLayout;
import javax.swing.JLabel;

public class GUI {

	private JFrame Hauptrahmen;
	/**
	 * Launch the application.
	 */
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				GUI window = new GUI();
				window.Hauptrahmen.setVisible(true);
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	Hauptrahmen = new JFrame();
	Hauptrahmen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Hauptrahmen.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
	Hauptrahmen.setExtendedState(JFrame.MAXIMIZED_BOTH);
	Hauptrahmen.setTitle("Schnittdatenrechner");
		
	JButton Button_Fraesen = new JButton("Fräsen");
	Button_Fraesen.setFont(new Font("Century", Font.BOLD, 70));
	Hauptrahmen.getContentPane().add(Button_Fraesen);
		
	JButton Button_Bohren = new JButton("Bohren");
	Button_Bohren.setFont(new Font("Century", Font.BOLD, 70));
	Hauptrahmen.getContentPane().add(Button_Bohren);
		
	JButton Button_Drehen = new JButton("Drehen");
	Button_Drehen.setFont(new Font("Century", Font.BOLD, 70));
	Hauptrahmen.getContentPane().add(Button_Drehen);}

}
