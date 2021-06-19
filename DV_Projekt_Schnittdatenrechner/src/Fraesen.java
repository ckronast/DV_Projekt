/**Name: Fraesen mit Bearbeiten erwitert;
 * Version: 1;
 * Von: Nico Waidele und Martin Maier**/
public class Fraesen extends Bearbeiten{
	
	/**Variable um den Vorschub speichern zu können**/
	private float vorschubjezahn;
	/**Variable um die Zähnezahl speichern zu können**/
	private int zähnezahl;
	/**Variable um die Zähnezahl speichern zu können**/
	private float fraerdurchmesser;
	
	/** Konstruktor 1 zum testen**/
	public Fraesen () throws Exceptpion
	{
		setVorschubjezahn(0,2);
		setZähnezahl(4);
		setFraeserdurchmesser(12);
	}
	
	/**
	 * Kostruktor um die übergebenen Attribute in den Variablen "vorschub" und "werkstückdurchmesser" zu speichern
	 * @param f Übergibt der Klasse Drehen den Vorschub
	 * @param d Übergibt der Klasse Drehen den Werkstückdurchmesser
	 */
	public Fraesen(float fz,int zz, float df) throws Exception
	{
		setVorschubjezahn(fz);
		setZähnezahl(zz);
		setFraeserdurchmesser(df);
	}
	

	/**Methodenname: vorschubgeschwindigkeitBerechnen;
	 * Ergebnistyp: float;
	 * Parameter: float drehzahl, float vorschub,int zähne;
	 * Beschreibung: Methode um die Vorschubgeschwindikeit aus Drehzal, Vorschub je Zahn und Zähnezal zu berechnen;
	 * Ergebnis: gibt die berechnete Vorschubgeschwindigkeit zurück**/
	public float vorschubgeschwindigkeitBerechnen() 
	{		
		float vorschubgeschwindigkeit;
		vorschubgeschwindigkeit = drehzahlBerechnen()*getVorschubjezahn()*getZähneahl();
		return vorschubgeschwindigkeit;
	}
	
	/**Methodenname: getZähneZahl;
	 * Ergebnistyp: float;
	 * Parameter: float zähneZahl;
	 * Beschreibung: Methode um die Variable 'zähneZahl' zurückzugeben, da diese als private deklariert wurde;
	 * Ergebnis: gibt die lokal gespeicherte Variable 'zähneZahl' zurück**/
	public int getZähneZahl() {
		return zähneZahl;
	}

	/**Methodenname: setZähneZahl;
	 * Ergebnistyp: float zähneZahl;
	 * Parameter: float zähneZahl;
	 * Beschreibung: Methode um der lokal gespeicherten Variable 'zähneZahl' einen Wert zuzuweisen;
	 * Ergebnis: speichert die Variable 'zähneZahl' mit einem neuen Wert**/
	public void setDurchmesser(int zähneZahl) {
		this.zähneZahl = zähneZahl;
	}

	
}
	
