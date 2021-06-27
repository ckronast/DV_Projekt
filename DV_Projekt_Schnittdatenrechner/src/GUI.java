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
	private JLabel lblDrehzahlBohren;
	
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
	Menue.setBackground(new Color(144, 238, 144));
	layeredPane.add(Menue, "name_102752488512600");
	Menue.setLayout(null);
	
	JButton Button_Bohren = new JButton("Bohren");
	Button_Bohren.setFont(new Font("Tahoma", Font.PLAIN, 35));
	Button_Bohren.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			Panel_Öffnen(Bohren);
		}
	});
	Button_Bohren.setBounds(130, 140, 350, 435);
	Menue.add(Button_Bohren);
	
	JLabel headlineMenue = new JLabel("MEN\u00DC");
	headlineMenue.setHorizontalAlignment(SwingConstants.CENTER);
	headlineMenue.setBounds(580, 10, 350, 40);
	headlineMenue.setFont(new Font("Tahoma", Font.BOLD, 40));
	Menue.add(headlineMenue);
	
	JButton Button_Fräsen = new JButton("Fräsen");
	Button_Fräsen.setFont(new Font("Tahoma", Font.PLAIN, 35));
	Button_Fräsen.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			Panel_Öffnen(Fraesen);
		}
	});
	Button_Fräsen.setBounds(580, 140, 350, 435);
	Menue.add(Button_Fräsen);
	
	JButton Button_Drehen = new JButton("Drehen");
	Button_Drehen.setFont(new Font("Tahoma", Font.PLAIN, 35));
	Button_Drehen.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			Panel_Öffnen(Drehen);
		}
	});
	Button_Drehen.setBounds(1030, 140, 350, 435);
	Menue.add(Button_Drehen);
	
	Bohren = new JPanel();
	Bohren.setBackground(new Color(144, 238, 144));
	layeredPane.add(Bohren, "name_102757503673300");
	Bohren.setLayout(null);
	
	JButton ButtonBack0 = new JButton("Back");
	ButtonBack0.setFont(new Font("Tahoma", Font.BOLD, 30));
	ButtonBack0.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			Panel_Öffnen(Menue);
		}
	});
	ButtonBack0.setBounds(1280, 600, 120, 50);
	Bohren.add(ButtonBack0);
	
	JLabel headlineBohren = new JLabel("BOHREN");
	headlineBohren.setHorizontalAlignment(SwingConstants.CENTER);
	headlineBohren.setBounds(580, 10, 350, 40);
	headlineBohren.setFont(new Font("Tahoma", Font.BOLD, 40));
	Bohren.add(headlineBohren);
	
	JLabel lblDurchmesserBohren = new JLabel("Durchmesser (mm):");
	lblDurchmesserBohren.setFont(new Font("Tahoma", Font.PLAIN, 35));
	lblDurchmesserBohren.setBounds(125, 160, 400, 50);
	Bohren.add(lblDurchmesserBohren);
	
	JTextField EingabeDurchmesserBohren = new JTextField();
	EingabeDurchmesserBohren.setFont(new Font("Tahoma", Font.PLAIN, 35));
	EingabeDurchmesserBohren.setBounds(780, 160, 200, 50);
	Bohren.add(EingabeDurchmesserBohren);
	EingabeDurchmesserBohren.setColumns(10);
	
	JLabel lblSchnittgeschwindigkeitBohren = new JLabel("Schnittgeschwindigkeit (m/min):");
	lblSchnittgeschwindigkeitBohren.setFont(new Font("Tahoma", Font.PLAIN, 35));
	lblSchnittgeschwindigkeitBohren.setBounds(125, 250, 560, 50);
	Bohren.add(lblSchnittgeschwindigkeitBohren);
	
	JTextField EingabeSchnittgeschwindigkeitBohren = new JTextField();
	EingabeSchnittgeschwindigkeitBohren.setFont(new Font("Tahoma", Font.PLAIN, 35));
	EingabeSchnittgeschwindigkeitBohren.setBounds(780, 250, 200, 50);
	Bohren.add(EingabeSchnittgeschwindigkeitBohren);
	EingabeSchnittgeschwindigkeitBohren.setColumns(10);
	
	
	JButton btnBerechnenBohren = new JButton("Berechnen");
	btnBerechnenBohren.setFont(new Font("Tahoma", Font.BOLD, 30));
	btnBerechnenBohren.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			float Durchmesser;
			float Schnitt;
			String Eingabe1 = EingabeDurchmesserBohren.getText();
			String Eingabe2 = EingabeSchnittgeschwindigkeitBohren.getText();
			try {
				Durchmesser = Float.parseFloat(Eingabe1);
				Schnitt = Float.parseFloat(Eingabe2);
				Bohren Bohr = new Bohren(Schnitt, Durchmesser);
				float Ergebnis = Bohr.drehzahlBerechnen();
				lblDrehzahlBohren.setText("Drehzahl (1/min): " + Ergebnis);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	});
	btnBerechnenBohren.setBounds(125, 360, 855, 50);
	Bohren.add(btnBerechnenBohren);
	
	lblDrehzahlBohren = new JLabel("Drehzahl (1/min):");
	lblDrehzahlBohren.setFont(new Font("Tahoma", Font.PLAIN, 35));
	lblDrehzahlBohren.setBounds(125, 460, 500, 50);
	Bohren.add(lblDrehzahlBohren);
	
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
	ButtonBack1.setBounds(500, 250, 100, 50);
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
