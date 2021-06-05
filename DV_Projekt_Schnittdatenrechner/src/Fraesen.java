/**Name: Fraesen mit Bearbeiten erwitert;
 * Version: 1;
 * Von: Nico Waidele und Martin Maier**/
public class Fraesen extends Bearbeiten{
	
	/**Variable um den Vorschub speichern zu k�nnen**/
	private float vorschubJeZahn;
	/**Variable um die Vorschubgeschwindigkeit speichern zu k�nnen**/
	private float vorschubgeschwindigkeit;
	/**Variable um die Drehzahl speichern zu k�nnen**/
	private float drehzahlFraesen;
	/**Variable um die Z�hnezahl speichern zu k�nnen**/
	private int z�hneZahl;
	
	/**Konstruktor1: Bohren;
	 * Ergebnistyp: keiner;
	 * Parameter: float drehzahl, float vorschub, int z�hne;**/
	public Fraesen(float drehzahl, float vorschub,int z�hne)
	{
		drehzahlFraesen = drehzahl;
		vorschubJeZahn = vorschub ;
		z�hneZahl = z�hne;
	}
	

	/**Methodenname: vorschubgeschwindigkeitBerechnen;
	 * Ergebnistyp: float;
	 * Parameter: float drehzahl, float vorschub,int z�hne;
	 * Beschreibung: Methode um die Vorschubgeschwindikeit aus Drehzal, Vorschub je Zahn und Z�hnezal zu berechnen;
	 * Ergebnis: gibt die berechnete Vorschubgeschwindigkeit zur�ck**/
	public float vorschubgeschwindigkeitBerechnen() 
	{		
		vorschubgeschwindigkeit = drehzahlFraesen*vorschubJeZahn*z�hneZahl;
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
	
