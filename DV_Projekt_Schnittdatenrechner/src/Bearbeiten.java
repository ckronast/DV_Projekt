/**Oberklasse für Bohren, Drehen, und Fräsen;
 * beinhaltet die Methode 'drehzahlBerechnen' sowie die Attribute 'schnittgeschwindigkeit' und 'durchmesser', und übergibt diese an die Unterklassen**/
public class Bearbeiten { 
	/**Variable um die Schnittgeschwindigkeit speichern zu können**/
	private float schnittgeschwindigkeit;
	/**Variable um den Durchmesser speichern zu können**/
	private float durchmesser;
	
	/**Methode um die Drehzahl aus der Schnittgeschwindigkeit und dem Durchmesser zu berechnen**/
	public float drehzahlBerechnen() {
		float drehzahl;
		drehzahl = (float) (getSchnittgeschwindigkeit()/(Math.PI*getDurchmesser()));
		return drehzahl;
	}

	/**Methode um die Variable 'durchmesser' zurückzugeben**/
	public float getDurchmesser() {
		return durchmesser;
	}

	/**Methode um der Variable 'durchmesser' einen Wert zuzuweisen**/
	public void setDurchmesser(float durchmesser) {
		this.durchmesser = durchmesser;
	}

	/**Methode um die Variable 'schnittgeschwindigkeit' zurückzugeben**/
	public float getSchnittgeschwindigkeit() {
		return schnittgeschwindigkeit;
	}

	/**Methode um der Variable 'schnittgeschwindigkeit' einen Wert zuzuweisen**/
	public void setSchnittgeschwindigkeit(float schnittgeschwindigkeit) {
		this.schnittgeschwindigkeit = schnittgeschwindigkeit;
	}

}
