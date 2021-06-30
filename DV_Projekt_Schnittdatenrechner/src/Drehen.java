/**Klassenname: Drehen;
 * Beschreibung: Berechnet die Vorschubgeschwindigkeit, mit den übergebenen Attributen; ist eine Unterklasse von Bearbeiten;
 * @version 1.1
 * @author Tom Mutschler 
 */

public class Drehen extends Bearbeiten {
	
	/**Variable um den Vorschub zu speichern**/
	private float vorschub;
	/**Variable um den Werkstückdurchmesser zu speichern**/
	private float werkstückdurchmesser;
	
	
	
	/**
	 * Zweiter Konstuktor 
	 * Setzt die Werte Vorschub und Werkstückdurchmesser auf vorgegebene Werte
	 */
	public Drehen () throws Exception
	{
		setVorschub(5);
		setDurchmesser(10);
		setSchnittgeschwindigkeit(25);

	}
	
	/**
	 * Kostruktor um die übergebenen Attribute in den Variablen "vorschub" und "werkstückdurchmesser" zu speichern
	 * @param f Übergibt der Klasse Drehen den Vorschub
	 * @param d Übergibt der Klasse Drehen den Werkstückdurchmesser
	 */
	public Drehen(float f, float d, float fc) throws Exception
	{
		setVorschub(f);
		setDurchmesser(d);
		setSchnittgeschwindigkeit(fc);
	}
	

	
	/**Methode mit dem Namen "vorschubgeschwindigkeitBerechnen", die mit der Drehzahl und dem Vorschub die Vorschubgeschwindigkeit berechnet
	 * @return Ausgeben der berechneten Vorschubgeschwindigkeit
	 */
	public float vorschubgeschwindigkeitBerechnen() throws Exception
	{	
		float vorschubgeschwindigkeit;
		vorschubgeschwindigkeit = drehzahlBerechnen()*getVorschub();
		return vorschubgeschwindigkeit;
	}
	
	
	
	
	
	/** Gibt die Variable "vorschub" zurück, da diese als private deklariert wurde;
	 * @return vorschub
	 */
	public float getVorschub() {
		return vorschub;
	}

	
	/** Der lokal gespeicherten Variable "vorschub" wird ein Wert zugewiesen, der noch auf seine Gültigkeit überprüft wird
	 * @param vorschub Neuer Wert für "vorschub"
	 */
	public void setVorschub(float vorschub) throws Exception{
		if(vorschub>0 && vorschub<1)
			this.vorschub = vorschub;
		else 
			throw new Exception("Ungültiger Vorschub");
		
	}

	
	
	/** Gibt die Variable "werkstückdurchmesser" zurück, da diese als private deklariert wurde;
	 * @return werkstückdurchmesser
	 */
	public float getWerkstückdurchmesser() {
		return werkstückdurchmesser;
	}

	
	/** Der lokal gespeicherten Variable "werkstückdurchmesser" wird ein Wert zugewiesen, der noch auf seine Gültigkeit überprüft wird
	 * @param werkstückdurchmesser Neuer Wert für "werkstückdurchmesser" 
	 */
	public void setWerkstückdurchmesser(float werkstückdurchmesser) throws Exception {
		if(werkstückdurchmesser>0 && werkstückdurchmesser<200)
			this.werkstückdurchmesser = werkstückdurchmesser;
		else 
			throw new Exception("Ungültiger Werkstückdurchmesser");
		 
	}
}