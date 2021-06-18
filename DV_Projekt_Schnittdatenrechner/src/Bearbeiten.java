/**
 * Klassenname: Bearbeiten;
 * Beschreibung: beinhaltet die Methode 'drehzahlBerechnen' sowie die Attribute 'schnittgeschwindigkeit' und 'durchmesser', und übergibt diese an die Unterklassen;
 * Version: 1;
 * Autoren: Großkopf, Konstantin und Kronast, Constantin
 */

public class Bearbeiten { 
	
	/**Variable um die Schnittgeschwindigkeit speichern zu können**/
	private float schnittgeschwindigkeit;
	/**Variable um den Durchmesser speichern zu können**/
	private float durchmesser;
	
	
	/**
	 * Methode um die Drehzahl aus der Schnittgeschwindigkeit und dem Durchmesser zu berechnen
	 * @return berechnete Drehzahl
	 */
	public float drehzahlBerechnen() throws Exception {
		float drehzahl;
		drehzahl = (float) (getSchnittgeschwindigkeit()/(Math.PI*getDurchmesser()));
		return drehzahl;
	}

	
	/**
	 * Methode um die Variable 'durchmesser' zurückzugeben, da diese als private deklariert wurde
	 * @return durchmesser
	 */
	public float getDurchmesser() {
		return durchmesser;
	}

	/**
	 * Methode um der lokal gespeicherten Variable 'durchmesser' einen Wert zuzuweisen
	 * @param durchmesser bekommt einen Wert zugewiesen
	 */
	public void setDurchmesser(float durchmesser) throws Exception {
		if(durchmesser>0 && durchmesser<=100)
			this.durchmesser = durchmesser;
		if(durchmesser > 100) 
			throw new Exception("Zu großer Eingabewert");
		else 
			throw new Exception("Ungültige Eingabe");
	}

	/**
	 * Methode um die Variable 'schnittgeschwindigkeit' zurückzugeben, da diese als private deklariert wurde
	 * @return schnittgeschwindigkeit
	 */
	public float getSchnittgeschwindigkeit() {
		return schnittgeschwindigkeit;
	}

	/**
	 * Methode um der lokal gespeicherten Variable 'schnittgeschwindigkeit' einen Wert zuzuweisen
	 * @param schnittgeschwindigkeit bekommt einen Wert zugewiesen
	 */
	public void setSchnittgeschwindigkeit(float schnittgeschwindigkeit) throws Exception {
		if(schnittgeschwindigkeit>0 && schnittgeschwindigkeit<=200)
			this.schnittgeschwindigkeit = schnittgeschwindigkeit;
		if(schnittgeschwindigkeit > 200) 
			throw new Exception("Zu großer Eingabewert");
		else 
			throw new Exception("Ungültige Eingabe");
	}
	
	/**
	 * Übergibt die eingegebenen Werte mit den Set-Methoden der Klasse Bearbeiten an die entsprechenden Variablen
	 * @param Vc übergibt die Schnittgeschwindigkeit
	 * @param d übergibt den Bohrerdurchmesser
	 */
	public Bearbeiten (float Vc, float d) throws Exception {
		setSchnittgeschwindigkeit(Vc);
		setDurchmesser(d);
	};
	
	/**
	 * Setzt mit hilfe der set-Methoden die Werte Durchmesser und Schnittgeschwindigkeit auf vorgegebene Werte
	 */
	 public Bearbeiten() throws Exception {
		 setSchnittgeschwindigkeit(100);
		 setDurchmesser(15);
	 };

}