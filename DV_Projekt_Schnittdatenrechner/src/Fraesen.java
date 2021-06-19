/**Name: Fraesen mit Bearbeiten erwitert;
 * Version: 1;
 * Von: Nico Waidele und Martin Maier**/
public class Fraesen extends Bearbeiten{
	
	/**Variable um den Vorschub speichern zu k�nnen**/
	private float vorschubjezahn;
	/**Variable um die Z�hnezahl speichern zu k�nnen**/
	private int z�hnezahl;
	/**Variable um die Z�hnezahl speichern zu k�nnen**/
	private float werkzeugdurchmesser;
	
	/**
	 * Kostruktor um die �bergebenen Attribute in den Variablen "vorschub" und "werkst�ckdurchmesser" zu speichern
	 * @param f �bergibt der Klasse Drehen den Vorschub
	 * @param d �bergibt der Klasse Drehen den Werkst�ckdurchmesser
	 */
	public Fraesen(float fz,int zz, float df) throws Exception
	{
		setVorschubjezahn(fz);
		setZ�hnezahl(zz);
		setWerkzeugdurchmesser(df);
	}
	
	/** Konstruktor 1 zum testen**/
	public Fraesen () throws Exception
	{
		setVorschubjezahn(1/5);
		setZ�hnezahl(4);
		setWerkzeugdurchmesser(12);
	}
	
	

	/**Methodenname: vorschubgeschwindigkeitBerechnen;
	 * Ergebnistyp: float;
	 * Parameter: float drehzahl, float vorschub,int z�hne;
	 * Beschreibung: Methode um die Vorschubgeschwindikeit aus Drehzal, Vorschub je Zahn und Z�hnezal zu berechnen;
	 * Ergebnis: gibt die berechnete Vorschubgeschwindigkeit zur�ck**/
	public float vorschubgeschwindigkeitBerechnen() 
	{		
		float vorschubgeschwindigkeit;
		vorschubgeschwindigkeit = drehzahlBerechnen*getVorschubjezahn()*getZ�hnezahl();
		return vorschubgeschwindigkeit;
	}
	
	
	/**Methodenname: getVorschubjezahn;
	 * Ergebnistyp: float;
	 * Parameter: float vorschubjezahn;
	 * Beschreibung: Methode um die Variable 'vorschubjezahn' zur�ckzugeben, da diese als private deklariert wurde;
	 * Ergebnis: gibt die lokal gespeicherte Variable 'vorschubjezahn' zur�ck**/
	public float getVorschubjezahn() {
		return vorschubjezahn;
	}

	/**Methodenname: setVorschubjezahn;
	 * Ergebnistyp: float vorschubjezahn;
	 * Parameter: float vorschubjezahn;
	 * Beschreibung: Methode um der lokal gespeicherten Variable 'vorschubjezahn' einen Wert zuzuweisen;
	 * Ergebnis: speichert die Variable 'vorschubjezahn' mit einem neuen Wert**/
	public void setVorschubjezahn(float vorschubjezahn) throws Exception{
		if(vorschubjezahn>0 && vorschubjezahn<0.4)
			this.vorschubjezahn = vorschubjezahn;
		else
			throw new Exception ("Bitte geben sie einen g�ltige Vorschub je Zahn ein! Dieser muss gr��er als Null, positiv und kleiner als 0.4 sein.");
	}
	
	
	/**Methodenname: getVorschubjezahn;
	 * Ergebnistyp: int;
	 * Parameter: int z�hneZahl;
	 * Beschreibung: Methode um die Variable 'z�hneZahl' zur�ckzugeben, da diese als private deklariert wurde;
	 * Ergebnis: gibt die lokal gespeicherte Variable 'z�hneZahl' zur�ck**/
	public int getZ�hnezahl() {
		return z�hnezahl;
	}

	/**Methodenname: setZ�hnezahl;
	 * Ergebnistyp: int z�hnezahl;
	 * Parameter: int z�hnezahl;
	 * Beschreibung: Methode um der lokal gespeicherten Variable 'z�hnezahl' einen Wert zuzuweisen;
	 * Ergebnis: speichert die Variable 'z�hnezahl' mit einem neuen Wert**/
	public void setZ�hnezahl(int z�hnezahl) throws Exception{
		if(z�hnezahl>0 && z�hnezahl%1==0)
			this.z�hnezahl = z�hnezahl;
		else
			throw new Exception ("Bitte geben sie eine g�ltige Z�hneanzahl ein! Diese muss ganzzahlig, positiv und gr��er als Null sein.");
	}
	
	/**Methodenname: getWerkzeugdurchmesser;
	 * Ergebnistyp: float;
	 * Parameter: float werkzeugdurchmesser;
	 * Beschreibung: Methode um die Variable 'werkzeugdurchmesser' zur�ckzugeben, da diese als private deklariert wurde;
	 * Ergebnis: gibt die lokal gespeicherte Variable 'werkzeugdurchmesser' zur�ck**/
	public float getWerkzeugdurchmesser() {
		return werkzeugdurchmesser;
	}

	/**Methodenname: setWerkzeugdurchmesser;
	 * Ergebnistyp: float werkzeugdurchmesser;
	 * Parameter: float werkzeugdurchmesser;
	 * Beschreibung: Methode um der lokal gespeicherten Variable 'werkzeugdurchmesser' einen Wert zuzuweisen;
	 * Ergebnis: speichert die Variable 'werkzeugdurchmesser' mit einem neuen Wert**/
	public void setWerkzeugdurchmesser(float werkzeugdurchmesser) throws Exception{
		if(werkzeugdurchmesser>0)
			this.werkzeugdurchmesser = werkzeugdurchmesser;
		else
			throw new Exception ("Bitte geben sie einen g�ltigen Werkzeugdurchmesser ein! Dieser muss gr��er als Null und positiv sein.");
	}
	
}
	
