/**Name: Fraesen mit Bearbeiten erwitert;
 * Version: 1;
 * Von: Nico Waidele und Martin Maier**/
public class Fraesen extends Bearbeiten{
	
	/**Variable um den Vorschub speichern zu können**/
	private float vorschubJeZahn;
	/**Variable um die Vorschubgeschwindigkeit speichern zu können**/
	private float vorschubgeschwindigkeit;
	/**Variable um die Drehzahl speichern zu können**/
	private float drehzahlFraesen;
	/**Variable um die Zähnezahl speichern zu können**/
	private int zähneZahl;
	
	/**Konstruktor1: Bohren;
	 * Ergebnistyp: keiner;
	 * Parameter: float drehzahl, float vorschub, int zähne;**/
	public Fraesen(float drehzahl, float vorschub,int zähne)
	{
		drehzahlFraesen = drehzahl;
		vorschubJeZahn = vorschub ;
		zähneZahl = zähne;
	}
	

	/**Methodenname: vorschubgeschwindigkeitBerechnen;
	 * Ergebnistyp: float;
	 * Parameter: float drehzahl, float vorschub,int zähne;
	 * Beschreibung: Methode um die Vorschubgeschwindikeit aus Drehzal, Vorschub je Zahn und Zähnezal zu berechnen;
	 * Ergebnis: gibt die berechnete Vorschubgeschwindigkeit zurück**/
	public float vorschubgeschwindigkeitBerechnen() 
	{		
		vorschubgeschwindigkeit = drehzahlFraesen*vorschubJeZahn*zähneZahl;
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
	
