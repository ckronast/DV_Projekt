/**Oberklasse f�r Bohren, Drehen, und Fr�sen;
 * beinhaltet die Methode 'drehzahlBerechnen' sowie die Attribute 'schnittgeschwindigkeit' und 'durchmesser', und �bergibt diese an die Unterklassen**/
public class Bearbeiten { 
	/**Variable um die Schnittgeschwindigkeit speichern zu k�nnen**/
	private float schnittgeschwindigkeit;
	/**Variable um den Durchmesser speichern zu k�nnen**/
	private float durchmesser;
	
	/**Methode um die Drehzahl aus der Schnittgeschwindigkeit und dem Durchmesser zu berechnen**/
	public float drehzahlBerechnen() {
		float drehzahl;
		drehzahl = (float) (getSchnittgeschwindigkeit()/(Math.PI*getDurchmesser()));
		return drehzahl;
	}

	/**Methode um die Variable 'durchmesser' zur�ckzugeben**/
	public float getDurchmesser() {
		return durchmesser;
	}

	/**Methode um der Variable 'durchmesser' einen Wert zuzuweisen**/
	public void setDurchmesser(float durchmesser) {
		this.durchmesser = durchmesser;
	}

	/**Methode um die Variable 'schnittgeschwindigkeit' zur�ckzugeben**/
	public float getSchnittgeschwindigkeit() {
		return schnittgeschwindigkeit;
	}

	/**Methode um der Variable 'schnittgeschwindigkeit' einen Wert zuzuweisen**/
	public void setSchnittgeschwindigkeit(float schnittgeschwindigkeit) {
		this.schnittgeschwindigkeit = schnittgeschwindigkeit;
	}

}
