/**
 * Klassenname: Bearbeiten;
 * Beschreibung: beinhaltet die Methode 'drehzahlBerechnen' sowie die Attribute 'schnittgeschwindigkeit' und 'durchmesser', und �bergibt diese an die Unterklassen;
 * Version: 1;
 * Autoren: Gro�kopf, Konstantin und Kronast, Constantin
 */

public class Bearbeiten { 
	
	/**Variable um die Schnittgeschwindigkeit speichern zu k�nnen**/
	private float schnittgeschwindigkeit;
	/**Variable um den Durchmesser speichern zu k�nnen**/
	private float durchmesser;
	
	
	/**
	 * Methode um die Drehzahl aus der Schnittgeschwindigkeit und dem Durchmesser zu berechnen
	 * @return berechnete Drehzahl
	 */
	public float drehzahlBerechnen() throws Exception {
		float drehzahl;
		drehzahl = (float) (getSchnittgeschwindigkeit()/(Math.PI*getDurchmesser()/1000));
		return drehzahl;
	}

	
	/**
	 * Methode um die Variable 'durchmesser' zur�ckzugeben, da diese als private deklariert wurde
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
		if(durchmesser > 100) 
			throw new Exception("Zu gro�er Eingabewert");
		
		if(durchmesser>0 && durchmesser<=100)
			this.durchmesser = durchmesser;
		else 
			throw new Exception("Ung�ltige Eingabe");
	}

	/**
	 * Methode um die Variable 'schnittgeschwindigkeit' zur�ckzugeben, da diese als private deklariert wurde
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
		if(schnittgeschwindigkeit > 200) 
			throw new Exception("Zu gro�er Eingabewert");
		
		if(schnittgeschwindigkeit>0 && schnittgeschwindigkeit<=200)
			this.schnittgeschwindigkeit = schnittgeschwindigkeit;
		else 
			throw new Exception("Ung�ltige Eingabe");
	}
	
	/**
	 * �bergibt die eingegebenen Werte mit den Set-Methoden der Klasse Bearbeiten an die entsprechenden Variablen
	 * @param Vc �bergibt die Schnittgeschwindigkeit
	 * @param d �bergibt den Bohrerdurchmesser
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