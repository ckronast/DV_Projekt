/**Name: Fraesen mit Bearbeiten erwitert;
 * @version: 1.2
 * @author: Nico Waidele und Martin Maier**/
public class Fraesen extends Bearbeiten{
	
	/**Variable um den Vorschub speichern zu können**/
	private float vorschubjezahn;
	/**Variable um die Zähnezahl speichern zu können**/
	private int zähnezahl;
	/**Variable um die Zähnezahl speichern zu können**/
	private float werkzeugdurchmesser;
	
	/**
	 * Kostruktor 1 um die übergebenen Attribute in Variablen zu speichern
	 * @param fz Übergibt der Klasse Fraesen den Vorschub je Zahn
	 * @param zz Übergibt der Klasse Fraesen die Zähnezahl
	 * @param df Übergibt der Klasse Fraesen den Werkzeugdurchmesser
	 */
	public Fraesen(float fz,int zz, float df) throws Exception
	{
		setVorschubjezahn(fz);
		setZähnezahl(zz);
		setWerkzeugdurchmesser(df);
	}
	
	/** Konstruktor 2 mit vorgegebenen Werten zum testen**/
	public Fraesen () throws Exception
	{
		setVorschubjezahn(1/5);
		setZähnezahl(4);
		setWerkzeugdurchmesser(12);
	}
	
	

	/**Methodenname: vorschubgeschwindigkeitBerechnen;
	 * Ergebnistyp: float;
	 * Parameter: float drehzahl, float vorschub,int zähne;
	 * Beschreibung: Methode um die Vorschubgeschwindikeit aus Drehzal, Vorschub je Zahn und Zähnezal zu berechnen;
	 * Ergebnis: gibt die berechnete Vorschubgeschwindigkeit zurück*
	 * @return Vorschubgeschwindigkeit
	 * */
	public float vorschubgeschwindigkeitBerechnen() 
	{		
		float vorschubgeschwindigkeit;
		vorschubgeschwindigkeit = drehzahlBerechnen*getVorschubjezahn()*getZähnezahl();
		return vorschubgeschwindigkeit;
	}
	
	
	/**Methodenname: getVorschubjezahn;
	 * Ergebnistyp: float;
	 * Parameter: float vorschubjezahn;
	 * Beschreibung: Methode um die Variable 'vorschubjezahn' zurückzugeben, da diese als private deklariert wurde;
	 * Ergebnis: gibt die lokal gespeicherte Variable 'vorschubjezahn' zurück*
	 * @return vorschubjezahn;
	 * */
	public float getVorschubjezahn() {
		return vorschubjezahn;
	}

	/**Methodenname: setVorschubjezahn;
	 * Ergebnistyp: float vorschubjezahn;
	 * Parameter: float vorschubjezahn;
	 * Beschreibung: Methode um der lokal gespeicherten Variable 'vorschubjezahn' einen Wert zuzuweisen;
	 * Ergebnis: speichert die Variable 'vorschubjezahn' mit einem neuen Wert*
	 * @param vorschubjezahn;
	 * */
	public void setVorschubjezahn(float vorschubjezahn) throws Exception{
		if(vorschubjezahn>0 && vorschubjezahn<0.4)
			this.vorschubjezahn = vorschubjezahn;
		else
			throw new Exception ("Bitte geben sie einen gültige Vorschub je Zahn ein! Dieser muss größer als Null, positiv und kleiner als 0.4 sein.");
	}
	
	
	/**Methodenname: getVorschubjezahn;
	 * Ergebnistyp: int;
	 * Parameter: int zähneZahl;
	 * Beschreibung: Methode um die Variable 'zähneZahl' zurückzugeben, da diese als private deklariert wurde;
	 * Ergebnis: gibt die lokal gespeicherte Variable 'zähneZahl' zurück*
	 * @return zähnezahl;
	 * */
	public int getZähnezahl() {
		return zähnezahl;
	}

	/**Methodenname: setZähnezahl;
	 * Ergebnistyp: int zähnezahl;
	 * Parameter: int zähnezahl;
	 * Beschreibung: Methode um der lokal gespeicherten Variable 'zähnezahl' einen Wert zuzuweisen;
	 * Ergebnis: speichert die Variable 'zähnezahl' mit einem neuen Wert*
	 * @param zähnezahl;
	 * */
	public void setZähnezahl(int zähnezahl) throws Exception{
		if(zähnezahl>0 && zähnezahl%1==0)
			this.zähnezahl = zähnezahl;
		else
			throw new Exception ("Bitte geben sie eine gültige Zähneanzahl ein! Diese muss ganzzahlig, positiv und größer als Null sein.");
	}
	
	/**Methodenname: getWerkzeugdurchmesser;
	 * Ergebnistyp: float;
	 * Parameter: float werkzeugdurchmesser;
	 * Beschreibung: Methode um die Variable 'werkzeugdurchmesser' zurückzugeben, da diese als private deklariert wurde;
	 * Ergebnis: gibt die lokal gespeicherte Variable 'werkzeugdurchmesser' zurück*
	 * @return werkzeugdurchmesser
	 * */
	public float getWerkzeugdurchmesser() {
		return werkzeugdurchmesser;
	}

	/**Methodenname: setWerkzeugdurchmesser;
	 * Ergebnistyp: float werkzeugdurchmesser;
	 * Parameter: float werkzeugdurchmesser;
	 * Beschreibung: Methode um der lokal gespeicherten Variable 'werkzeugdurchmesser' einen Wert zuzuweisen;
	 * Ergebnis: speichert die Variable 'werkzeugdurchmesser' mit einem neuen Wert*
	 * @param werkzeugdurchmesser
	 * */
	public void setWerkzeugdurchmesser(float werkzeugdurchmesser) throws Exception{
		if(werkzeugdurchmesser>0)
			this.werkzeugdurchmesser = werkzeugdurchmesser;
		else
			throw new Exception ("Bitte geben sie einen gültigen Werkzeugdurchmesser ein! Dieser muss größer als Null und positiv sein.");
	}
	
}
	
