/**
 * Autoren: Constantin Kronast & Konstantin Großkopf
 */

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.AbstractButton;
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
import javax.swing.JOptionPane;

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
	private JLabel lblDrehzahlFraesen;
	private JLabel lblDrehzahlDrehen;
	private JLabel lblVorschubgDrehen;
	private JLabel lblVorschubgFraesen;
	
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
	Hauptrahmen.setBounds(0,0,1470,710);
	
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
	
	JLabel lblDurchmesserBohren = new JLabel("Bohrerdurchmesser (mm):");
	lblDurchmesserBohren.setFont(new Font("Tahoma", Font.PLAIN, 35));
	lblDurchmesserBohren.setBounds(125, 100, 600, 50);
	Bohren.add(lblDurchmesserBohren);
	
	JTextField EingabeDurchmesserBohren = new JTextField();
	EingabeDurchmesserBohren.setFont(new Font("Tahoma", Font.PLAIN, 35));
	EingabeDurchmesserBohren.setBounds(780, 100, 200, 50);
	Bohren.add(EingabeDurchmesserBohren);
	EingabeDurchmesserBohren.setColumns(10);
	
	JLabel lblSchnittgeschwindigkeitBohren = new JLabel("Schnittgeschwindigkeit (m/min):");
	lblSchnittgeschwindigkeitBohren.setFont(new Font("Tahoma", Font.PLAIN, 35));
	lblSchnittgeschwindigkeitBohren.setBounds(125, 175, 560, 50);
	Bohren.add(lblSchnittgeschwindigkeitBohren);
	
	JTextField EingabeSchnittgeschwindigkeitBohren = new JTextField();
	EingabeSchnittgeschwindigkeitBohren.setFont(new Font("Tahoma", Font.PLAIN, 35));
	EingabeSchnittgeschwindigkeitBohren.setBounds(780, 175, 200, 50);
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
				float Ergebnis = java.lang.Math.round(Bohr.drehzahlBerechnen()*100);
				lblDrehzahlBohren.setText("Drehzahl (1/min): " + (Ergebnis/100));
			}
			catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Bitte Zahl mit Punkt eingeben");
			}
			catch (Exception e) {
				JOptionPane.showMessageDialog(null,e.getMessage());
			}
			
		}
	});
	btnBerechnenBohren.setBounds(125, 350, 855, 50);
	Bohren.add(btnBerechnenBohren);
	
	lblDrehzahlBohren = new JLabel("Drehzahl (1/min):");
	lblDrehzahlBohren.setFont(new Font("Tahoma", Font.PLAIN, 35));
	lblDrehzahlBohren.setBounds(125, 460, 626, 50);
	Bohren.add(lblDrehzahlBohren);
	
	Drehen = new JPanel();
	Drehen.setBackground(new Color(144, 238, 144));
	layeredPane.add(Drehen, "name_102774591348800");
	Drehen.setLayout(null);
	
	JLabel headlineDrehen = new JLabel("DREHEN");
	headlineDrehen.setHorizontalAlignment(SwingConstants.CENTER);
	headlineDrehen.setBounds(580, 10, 350, 40);
	headlineDrehen.setFont(new Font("Tahoma", Font.BOLD, 40));
	Drehen.add(headlineDrehen);
	
	JLabel lblDurchmesserDrehen = new JLabel("Werkstückdurchmesser (mm):");
	lblDurchmesserDrehen.setFont(new Font("Tahoma", Font.PLAIN, 35));
	lblDurchmesserDrehen.setBounds(125, 100, 600, 50);
	Drehen.add(lblDurchmesserDrehen);
	
	JTextField EingabeDurchmesserDrehen = new JTextField();
	EingabeDurchmesserDrehen.setFont(new Font("Tahoma", Font.PLAIN, 35));
	EingabeDurchmesserDrehen.setBounds(780, 100, 200, 50);
	Drehen.add(EingabeDurchmesserDrehen);
	EingabeDurchmesserDrehen.setColumns(10);
	
	JLabel lblVorschubDrehen = new JLabel("Vorschub (mm):");
	lblVorschubDrehen.setFont(new Font("Tahoma", Font.PLAIN, 35));
	lblVorschubDrehen.setBounds(125, 175, 400, 50);
	Drehen.add(lblVorschubDrehen);
	
	JTextField EingabeVorschubDrehen = new JTextField();
	EingabeVorschubDrehen.setFont(new Font("Tahoma", Font.PLAIN, 35));
	EingabeVorschubDrehen.setBounds(780, 175, 200, 50);
	Drehen.add(EingabeVorschubDrehen);
	EingabeVorschubDrehen.setColumns(10);
	
	JLabel lblSchnittgeschwindigkeitDrehen = new JLabel("Schnittgeschwindigkeit (m/min):");
	lblSchnittgeschwindigkeitDrehen.setFont(new Font("Tahoma", Font.PLAIN, 35));
	lblSchnittgeschwindigkeitDrehen.setBounds(125, 250, 600, 50);
	Drehen.add(lblSchnittgeschwindigkeitDrehen);
	
	JTextField EingabeSchnittgeschwindigkeitDrehen = new JTextField();
	EingabeSchnittgeschwindigkeitDrehen.setFont(new Font("Tahoma", Font.PLAIN, 35));
	EingabeSchnittgeschwindigkeitDrehen.setBounds(780, 250, 200, 50);
	Drehen.add(EingabeSchnittgeschwindigkeitDrehen);
	EingabeSchnittgeschwindigkeitDrehen.setColumns(10);
	
	JButton btnBerechnenDrehen = new JButton("Berechnen");
	btnBerechnenDrehen.setFont(new Font("Tahoma", Font.BOLD, 30));
	btnBerechnenDrehen.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			float Durchmesser;
			float Schub;
			float Schnittg;
			String Eingabe1 = EingabeDurchmesserDrehen.getText();
			String Eingabe2 = EingabeVorschubDrehen.getText();
			String Eingabe3 = EingabeSchnittgeschwindigkeitDrehen.getText();
			try {
				Durchmesser = Float.parseFloat(Eingabe1);
				Schub = Float.parseFloat(Eingabe2);
				Schnittg = Float.parseFloat(Eingabe3);
				Drehen Dreh = new Drehen(Schub, Durchmesser, Schnittg);
				float drehzahlDrehen = java.lang.Math.round(Dreh.drehzahlBerechnen()*100);
				float vorschubgDrehen = java.lang.Math.round(Dreh.vorschubgeschwindigkeitBerechnen()*100);
				lblDrehzahlDrehen.setText("Drehzahl (1/min): " + (drehzahlDrehen/100));
				lblVorschubgDrehen.setText("Vorschubgeschwindigkeit (mm/min): " + (vorschubgDrehen/100));
			}
			catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Bitte Zahl mit Punkt eingeben");
			}
			catch (Exception e) {
				JOptionPane.showMessageDialog(null,e.getMessage());
			}
			
		}
	});
	btnBerechnenDrehen.setBounds(125, 350, 855, 50);
	Drehen.add(btnBerechnenDrehen);
	
	lblDrehzahlDrehen = new JLabel("Drehzahl (1/min):");
	lblDrehzahlDrehen.setFont(new Font("Tahoma", Font.PLAIN, 35));
	lblDrehzahlDrehen.setBounds(125, 460, 1000, 50);
	Drehen.add(lblDrehzahlDrehen);
	
	lblVorschubgDrehen = new JLabel("Vorschubgeschwindigkeit (mm/min):");
	lblVorschubgDrehen.setFont(new Font("Tahoma", Font.PLAIN, 35));
	lblVorschubgDrehen.setBounds(125, 530, 1000, 50);
	Drehen.add(lblVorschubgDrehen);
	
	JButton ButtonBack1 = new JButton("Back");
	ButtonBack1.setFont(new Font("Tahoma", Font.PLAIN, 30));
	ButtonBack1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			Panel_Öffnen(Menue);
		}
	});
	ButtonBack1.setBounds(1280, 600, 120, 50);
	Drehen.add(ButtonBack1);
	
	
	
	Fraesen = new JPanel();
	Fraesen.setBackground(new Color(144, 238, 144));
	layeredPane.add(Fraesen, "name_102777175454400");
	Fraesen.setLayout(null);
	
	JLabel headlineFräsen = new JLabel("FRÄSEN");
	headlineFräsen.setHorizontalAlignment(SwingConstants.CENTER);
	headlineFräsen.setBounds(580, 10, 350, 40);
	headlineFräsen.setFont(new Font("Tahoma", Font.BOLD, 40));
	Fraesen.add(headlineFräsen);
	
	JLabel lblDurchmesserFraesen = new JLabel("Werkzeugdurchmesser (mm):");
	lblDurchmesserFraesen.setFont(new Font("Tahoma", Font.PLAIN, 35));
	lblDurchmesserFraesen.setBounds(125, 100, 600, 50);
	Fraesen.add(lblDurchmesserFraesen);
	
	JTextField EingabeDurchmesserFraesen = new JTextField();
	EingabeDurchmesserFraesen.setFont(new Font("Tahoma", Font.PLAIN, 35));
	EingabeDurchmesserFraesen.setBounds(780, 100, 200, 50);
	Fraesen.add(EingabeDurchmesserFraesen);
	EingabeDurchmesserFraesen.setColumns(10);
	
	JLabel lblVorschubFraesen = new JLabel("Vorschub je Zahn (mm):");
	lblVorschubFraesen.setFont(new Font("Tahoma", Font.PLAIN, 35));
	lblVorschubFraesen.setBounds(125, 160, 400, 50);
	Fraesen.add(lblVorschubFraesen);
	
	JTextField EingabeVorschubFraesen = new JTextField();
	EingabeVorschubFraesen.setFont(new Font("Tahoma", Font.PLAIN, 35));
	EingabeVorschubFraesen.setBounds(780, 160, 200, 50);
	Fraesen.add(EingabeVorschubFraesen);
	EingabeVorschubFraesen.setColumns(10);
	
	JLabel lblZaehnezahlFraesen = new JLabel("Zähnezahl:");
	lblZaehnezahlFraesen.setFont(new Font("Tahoma", Font.PLAIN, 35));
	lblZaehnezahlFraesen.setBounds(125, 220, 645, 50);
	Fraesen.add(lblZaehnezahlFraesen);
	
	JTextField EingabeZähnezahlFraesen = new JTextField();
	EingabeZähnezahlFraesen.setFont(new Font("Tahoma", Font.PLAIN, 35));
	EingabeZähnezahlFraesen.setBounds(780, 220, 200, 50);
	Fraesen.add(EingabeZähnezahlFraesen);
	EingabeZähnezahlFraesen.setColumns(10);
	
	JLabel lblSchnittgeschwindigkeitFraesen = new JLabel("Schnittgeschwindigkeit (m/min):");
	lblSchnittgeschwindigkeitFraesen.setFont(new Font("Tahoma", Font.PLAIN, 35));
	lblSchnittgeschwindigkeitFraesen.setBounds(125, 280, 645, 50);
	Fraesen.add(lblSchnittgeschwindigkeitFraesen);
	
	JTextField EingabeSchnittgeschwindigkeitFraesen = new JTextField();
	EingabeSchnittgeschwindigkeitFraesen.setFont(new Font("Tahoma", Font.PLAIN, 35));
	EingabeSchnittgeschwindigkeitFraesen.setBounds(780, 280, 200, 50);
	Fraesen.add(EingabeSchnittgeschwindigkeitFraesen);
	EingabeSchnittgeschwindigkeitFraesen.setColumns(10);
	
	JButton btnBerechnenFraesen = new JButton("Berechnen");
	btnBerechnenFraesen.setFont(new Font("Tahoma", Font.BOLD, 30));
	btnBerechnenFraesen.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			float Durchmesser;
			float SchubJeZahn;
			int Zahn;
			float Schnittg;
			String Eingabe1 = EingabeDurchmesserFraesen.getText();
			String Eingabe2 = EingabeVorschubFraesen.getText();
			String Eingabe3 = EingabeZähnezahlFraesen.getText();
			String Eingabe4 = EingabeSchnittgeschwindigkeitFraesen.getText();
			try {
				Durchmesser = Float.parseFloat(Eingabe1);
				SchubJeZahn = Float.parseFloat(Eingabe2);
				Zahn = Integer.parseInt(Eingabe3);
				Schnittg = Float.parseFloat(Eingabe4);
				Fraesen Fras = new Fraesen(SchubJeZahn, Zahn, Durchmesser, Schnittg);
				float drehzahlFraesen = java.lang.Math.round(Fras.drehzahlBerechnen()*100);
				float vorschubgDrehen = java.lang.Math.round(Fras.vorschubgeschwindigkeitBerechnen()*100);
				lblDrehzahlFraesen.setText("Drehzahl (1/min): " + (drehzahlFraesen/100));
				lblVorschubgFraesen.setText("Vorschubgeschwindigkeit (mm/min): " + (vorschubgDrehen/100));
			}
			catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Bitte Zahl mit Punkt eingeben");
			}
			catch (Exception e) {
				JOptionPane.showMessageDialog(null,e.getMessage());
			}
			
		}
	});
	btnBerechnenFraesen.setBounds(125, 350, 855, 50);
	Fraesen.add(btnBerechnenFraesen);
	
	lblDrehzahlFraesen = new JLabel("Drehzahl (1/min):");
	lblDrehzahlFraesen.setFont(new Font("Tahoma", Font.PLAIN, 35));
	lblDrehzahlFraesen.setBounds(125, 460, 582, 50);
	Fraesen.add(lblDrehzahlFraesen);
	
	lblVorschubgFraesen = new JLabel("Vorschubgeschwindigkeit (mm/min):");
	lblVorschubgFraesen.setFont(new Font("Tahoma", Font.PLAIN, 35));
	lblVorschubgFraesen.setBounds(125, 535, 855, 50);
	Fraesen.add(lblVorschubgFraesen);
	
	JButton ButtonBack2 = new JButton("Back");
	ButtonBack2.setFont(new Font("Tahoma", Font.PLAIN, 30));
	ButtonBack2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			Panel_Öffnen(Menue);
		}
	});
	ButtonBack2.setBounds(1280, 600, 120, 50);
	Fraesen.add(ButtonBack2);
	}
}
