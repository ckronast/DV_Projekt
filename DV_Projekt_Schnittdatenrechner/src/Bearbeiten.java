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
	public float drehzahlBerechnen() {
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
	public void setDurchmesser(float durchmesser) {
		this.durchmesser = durchmesser;
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
	public void setSchnittgeschwindigkeit(float schnittgeschwindigkeit) {
		this.schnittgeschwindigkeit = schnittgeschwindigkeit;
	}

}