import javax.swing.JOptionPane;

public class Test {

	public static void main(String[] args) {
		
		
		String eingabe_schnittgeschwindigkeit = JOptionPane.showInputDialog("Schnittgeschwindigkeit  [m/min]:");
		float schnittgeschwindigkeit = Float.parseFloat(eingabe_schnittgeschwindigkeit);
		
		String eingabe_bohrerdurchmesser = JOptionPane.showInputDialog("Bohrerdurchmesser [mm]:");
		float bohrerdurchmesser = Float.parseFloat(eingabe_bohrerdurchmesser);
		bohrerdurchmesser = bohrerdurchmesser/1000;
		
		
		Bohren berechnung = new Bohren(schnittgeschwindigkeit, bohrerdurchmesser);
		
		System.out.println(berechnung.drehzahlBerechnen());
	}

}