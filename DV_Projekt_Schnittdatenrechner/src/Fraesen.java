/**Name: Fraesen mit Bearbeiten erwitert;
 * Version: 1;
 * Von: Nico Waidele und Martin Maier**/
public class Fraesen extends Bearbeiten{
	
	/**Variable um den Vorschub speichern zu k�nnen**/
	private float vorschubjezahn;
	/**Variable um die Z�hnezahl speichern zu k�nnen**/
	private int z�hnezahl;
	/**Variable um die Z�hnezahl speichern zu k�nnen**/
	private float fraerdurchmesser;
	
	/** Konstruktor 1 zum testen**/
	public Fraesen () throws Exceptpion
	{
		setVorschubjezahn(0,2);
		setZ�hnezahl(4);
		setFraeserdurchmesser(12);
	}
	
	/**
	 * Kostruktor um die �bergebenen Attribute in den Variablen "vorschub" und "werkst�ckdurchmesser" zu speichern
	 * @param f �bergibt der Klasse Drehen den Vorschub
	 * @param d �bergibt der Klasse Drehen den Werkst�ckdurchmesser
	 */
	public Fraesen(float fz,int zz, float df) throws Exception
	{
		setVorschubjezahn(fz);
		setZ�hnezahl(zz);
		setFraeserdurchmesser(df);
	}
	

	/**Methodenname: vorschubgeschwindigkeitBerechnen;
	 * Ergebnistyp: float;
	 * Parameter: float drehzahl, float vorschub,int z�hne;
	 * Beschreibung: Methode um die Vorschubgeschwindikeit aus Drehzal, Vorschub je Zahn und Z�hnezal zu berechnen;
	 * Ergebnis: gibt die berechnete Vorschubgeschwindigkeit zur�ck**/
	public float vorschubgeschwindigkeitBerechnen() 
	{		
		float vorschubgeschwindigkeit;
		vorschubgeschwindigkeit = drehzahlBerechnen()*getVorschubjezahn()*getZ�hneahl();
		return vorschubgeschwindigkeit;
	}
	
	/**Methodenname: getZ�hneZahl;
	 * Ergebnistyp: float;
	 * Parameter: float z�hneZahl;
	 * Beschreibung: Methode um die Variable 'z�hneZahl' zur�ckzugeben, da diese als private deklariert wurde;
	 * Ergebnis: gibt die lokal gespeicherte Variable 'z�hneZahl' zur�ck**/
	public int getZ�hneZahl() {
		return z�hneZahl;
	}

	/**Methodenname: setZ�hneZahl;
	 * Ergebnistyp: float z�hneZahl;
	 * Parameter: float z�hneZahl;
	 * Beschreibung: Methode um der lokal gespeicherten Variable 'z�hneZahl' einen Wert zuzuweisen;
	 * Ergebnis: speichert die Variable 'z�hneZahl' mit einem neuen Wert**/
	public void setDurchmesser(int z�hneZahl) {
		this.z�hneZahl = z�hneZahl;
	}

	
}
	
