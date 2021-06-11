/**Klassenname: Bearbeiten;
 * Beschreibung: beinhaltet die Methode 'drehzahlBerechnen' sowie die Attribute 'schnittgeschwindigkeit' und 'durchmesser', und �bergibt diese an die Unterklassen;
 * Version: 1;
 * Autoren: Gro�kopf, Konstantin und Kronast, Constantin**/

public class Bearbeiten { 
	
	/**Variable um die Schnittgeschwindigkeit speichern zu k�nnen**/
	private float schnittgeschwindigkeit;
	/**Variable um den Durchmesser speichern zu k�nnen**/
	private float durchmesser;
	
	
	/**Methodenname: drehzahlBerechnen;
	 * Ergebnistyp: float;
	 * Beschreibung: Methode um die Drehzahl aus der Schnittgeschwindigkeit und dem Durchmesser zu berechnen;
	 * @param float schnittgeschwindigkeit, float durchmesser;
	 * @return float drehzahl**/
	public float drehzahlBerechnen() {
		float drehzahl;
		drehzahl = (float) (getSchnittgeschwindigkeit()/(Math.PI*getDurchmesser()));
		return drehzahl;
	}

	
	/**Methodenname: getDurchmesser;
	 * Ergebnistyp: float;
	 * Beschreibung: Methode um die Variable 'durchmesser' zur�ckzugeben, da diese als private deklariert wurde;
	 * @param float durchmesser;
	 * @return float durchmesser**/
	public float getDurchmesser() {
		return durchmesser;
	}

	/**Methodenname: setDurchmesser;
	 * Ergebnistyp: void;
	 * Beschreibung: Methode um der lokal gespeicherten Variable 'durchmesser' einen Wert zuzuweisen;
	 * @param float durchmesser;**/
	public void setDurchmesser(float durchmesser) {
		this.durchmesser = durchmesser;
	}

	/**Methodenname: getSchnittgeschwindigkeit;
	 * Ergebnistyp: float;
	 * Beschreibung: Methode um die Variable 'schnittgeschwindigkeit' zur�ckzugeben, da diese als private deklariert wurde;
	 * @param float schnittgeschwindigkeit;
	 * @return float schnittgeschwindigkeit**/
	public float getSchnittgeschwindigkeit() {
		return schnittgeschwindigkeit;
	}

	/**Methodenname: setSchnittgeschwindigkeit;
	 * Ergebnistyp: void;
	 * Beschreibung: Methode um der lokal gespeicherten Variable 'schnittgeschwindigkeit' einen Wert zuzuweisen;
	 * @param float schnittgeschwindigkeit;**/
	public void setSchnittgeschwindigkeit(float schnittgeschwindigkeit) {
		this.schnittgeschwindigkeit = schnittgeschwindigkeit;
	}

}