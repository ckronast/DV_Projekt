/**Klassenname: Bearbeiten
 * Beschreibung: beinhaltet die Methode 'drehzahlBerechnen' sowie die Attribute 'schnittgeschwindigkeit' und 'durchmesser', und übergibt diese an die Unterklassen
 * Version: 1
 * Autoren: Großkopf, Konstantin und Kronast, Constantin**/

public class Bearbeiten { 
	
	/**Variable um die Schnittgeschwindigkeit speichern zu können**/
	private float schnittgeschwindigkeit;
	/**Variable um den Durchmesser speichern zu können**/
	private float durchmesser;
	
	
	/**Methodenname: drehzahlBerechnen
	 * Ergebnistyp: float
	 * Parameter: float schnittgeschwindigkeit, float durchmesser
	 * Beschreibung: Methode um die Drehzahl aus der Schnittgeschwindigkeit und dem Durchmesser zu berechnen
	 * Ergebnis: gibt die berechnete Drehzahl zurück**/
	public float drehzahlBerechnen() {
		float drehzahl;
		drehzahl = (float) (schnittgeschwindigkeit/(Math.PI*durchmesser));
		return drehzahl;
	}

	
	/**Methodenname: getDurchmesser
	 * Ergebnistyp: float
	 * Parameter: float durchmesser
	 * Beschreibung: Methode um die Variable 'durchmesser' zurückzugeben, da diese als private deklariert wurde
	 * Ergebnis: gibt die lokal gespeicherte Variable 'durchmesser' zurück**/
	public float getDurchmesser() {
		return durchmesser;
	}

	/**Methodenname: setDurchmesser
	 * Ergebnistyp: float durchmesser
	 * Parameter: float durchmesser
	 * Beschreibung: Methode um der lokal gespeicherten Variable 'durchmesser' einen Wert zuzuweisen
	 * Ergebnis: speichert die Variable 'durchmesser' mit einem neuen Wert**/
	public void setDurchmesser(float durchmesser) {
		this.durchmesser = durchmesser;
	}

	/**Methodenname: getSchnittgeschwindigkeit
	 * Ergebnistyp: float
	 * Parameter: float schnittgeschwindigkeit
	 * Beschreibung: Methode um die Variable 'schnittgeschwindigkeit' zurückzugeben, da diese als private deklariert wurde
	 * Ergebnis: gibt die lokal gespeicherte Variable 'durchmesser' zurück**/
	public float getSchnittgeschwindigkeit() {
		return schnittgeschwindigkeit;
	}

	/**Methodenname: setSchnittgeschwindigkeit
	 * Ergebnistyp: float schnittgeschwindigkeit
	 * Parameter: float schnittgeschwindigkeit
	 * Beschreibung: Methode um der lokal gespeicherten Variable 'schnittgeschwindigkeit' einen Wert zuzuweisen
	 * Ergebnis: speichert die Variable 'schnittgeschwindigkeit' mit einem neuen Wert**/
	public void setSchnittgeschwindigkeit(float schnittgeschwindigkeit) {
		this.schnittgeschwindigkeit = schnittgeschwindigkeit;
	}

}
