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
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import javax.swing.JTextField;

public class GUI {

	private JFrame Hauptrahmen;
	private GUI window;
	private JPanel Bohren;
	private JPanel Drehen;
	private JPanel Fraesen;
	private JLayeredPane layeredPane;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel_6;
	
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
	
	public void Panel_Öffnen(JPanel Panelart)  {
		layeredPane.removeAll();
		layeredPane.add(Panelart);
		layeredPane.repaint();
		layeredPane.revalidate();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	Hauptrahmen = new JFrame();
	Hauptrahmen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Hauptrahmen.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
	Hauptrahmen.setTitle("Schnittdatenrechner");
	Hauptrahmen.setBounds(0,0,1471,710);
	
	layeredPane = new JLayeredPane();
	Hauptrahmen.getContentPane().add(layeredPane);
	layeredPane.setLayout(new CardLayout(0, 0));
	
	JPanel Menue = new JPanel();
	layeredPane.add(Menue, "name_102752488512600");
	Menue.setLayout(null);
	
	JButton Button_Bohren = new JButton("Bohren");
	Button_Bohren.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			Panel_Öffnen(Bohren);
		}
	});
	Button_Bohren.setBounds(127, 128, 338, 422);
	Menue.add(Button_Bohren);
	
	JLabel lblNewLabel_3 = new JLabel("MEN\u00DC");
	lblNewLabel_3.setBounds(730, 5, 60, 25);
	lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
	Menue.add(lblNewLabel_3);
	
	JButton Button_Fräsen = new JButton("Fräsen");
	Button_Fräsen.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			Panel_Öffnen(Fraesen);
		}
	});
	Button_Fräsen.setBounds(535, 128, 338, 422);
	Menue.add(Button_Fräsen);
	
	JButton Button_Drehen = new JButton("Drehen");
	Button_Drehen.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			Panel_Öffnen(Drehen);
		}
	});
	Button_Drehen.setBounds(997, 128, 338, 422);
	Menue.add(Button_Drehen);
	
	Bohren = new JPanel();
	layeredPane.add(Bohren, "name_102757503673300");
	Bohren.setLayout(null);
	
	JButton ButtonBack0 = new JButton("Back");
	ButtonBack0.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			Panel_Öffnen(Menue);
		}
	});
	ButtonBack0.setBounds(1339, 637, 89, 23);
	Bohren.add(ButtonBack0);
	
	JLabel lblNewLabel = new JLabel("BOHREN");
	lblNewLabel.setBounds(731, 5, 86, 25);
	lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
	Bohren.add(lblNewLabel);
	
	JLabel lblNewLabel_4 = new JLabel("Durchmesser (mm):");
	lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 27));
	lblNewLabel_4.setBounds(111, 155, 299, 45);
	Bohren.add(lblNewLabel_4);
	
	textField = new JTextField();
	textField.setBounds(763, 165, 113, 39);
	Bohren.add(textField);
	textField.setColumns(10);
	
	JLabel lblNewLabel_5 = new JLabel("Schnittgeschwindigkeit (m/min):");
	lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 40));
	lblNewLabel_5.setBounds(111, 240, 589, 45);
	Bohren.add(lblNewLabel_5);
	
	textField_1 = new JTextField();
	textField_1.setBounds(763, 240, 113, 45);
	Bohren.add(textField_1);
	textField_1.setColumns(10);
	
	
	JButton btnNewButton = new JButton("Brechen");
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			float Durchmesser;
			float Schnitti;
			String Eingabe1 = textField.getText();
			String Eingabe2 = textField_1.getText();
			try {
				Durchmesser = Float.parseFloat(Eingabe1);
				Schnitti = Float.parseFloat(Eingabe2);
				Bohren Bohr = new Bohren(Schnitti, Durchmesser);
				float Ergebnis = Bohr.drehzahlBerechnen();
				lblNewLabel_6.setText("Drehzahl: " + Ergebnis);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	});
	btnNewButton.setBounds(261, 344, 615, 39);
	Bohren.add(btnNewButton);
	
	lblNewLabel_6 = new JLabel("Drehzahl:");
	lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
	lblNewLabel_6.setBounds(136, 440, 865, 45);
	Bohren.add(lblNewLabel_6);
	
	Drehen = new JPanel();
	layeredPane.add(Drehen, "name_102774591348800");
	Drehen.setLayout(null);
	
	JLabel lblNewLabel_1 = new JLabel("DREHEN");
	lblNewLabel_1.setBounds(546, 11, 84, 25);
	lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
	Drehen.add(lblNewLabel_1);
	
	JButton ButtonBack1 = new JButton("Back");
	ButtonBack1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			Panel_Öffnen(Menue);
		}
	});
	ButtonBack1.setBounds(523, 254, 89, 23);
	Drehen.add(ButtonBack1);
	
	Fraesen = new JPanel();
	layeredPane.add(Fraesen, "name_102777175454400");
	Fraesen.setLayout(null);
	
	JLabel lblNewLabel_2 = new JLabel("FR\u00C4SEN");
	lblNewLabel_2.setBounds(0, 0, 81, 25);
	lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
	Fraesen.add(lblNewLabel_2);
	
	JButton ButtonBack2 = new JButton("Back");
	ButtonBack2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			Panel_Öffnen(Menue);
		}
	});
	ButtonBack2.setBounds(433, 301, 89, 23);
	Fraesen.add(ButtonBack2);
	}
}
