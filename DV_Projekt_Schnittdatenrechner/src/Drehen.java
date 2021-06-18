/**Klassenname: Drehen;
 * Beschreibung: Berechnet die Vorschubgeschwindigkeit, mit den übergebenen Attributen; ist eine Unterklasse von Bearbeiten;
 * @version 1.1
 * @author Tom Mutschler 
 */

public class Drehen extends Bearbeiten {
	
	/**Variable um den Vorschub zu speichern**/
	private float vorschub;
	/**Variable um die Vorschubgeschwindigkeit zu speichern**/
	private float vorschubgeschwindigkeit;
	/**Variable um den Werkstückdurchmesser zu speichern**/
	private float werkstückdurchmesser;
	
	
	
	/**
	 * Zweiter Konstuktor 
	 */
	public Drehen ()
	{
		setVorschubgeschwindigkeit(20);
		setVorschub(5);
		setWerkstückdurchmesser(10);
	}
	
	/**
	 * Kostruktor um die übergebenen Attribute in den Variablen "vorschub" und "durchmesser" zu speichern
	 * @param f Übergibt der Klasse Drehen den Vorschub
	 * @param d Übergibt der Klasse Drehen den Werkstückdurchmesser
	 */
	public Drehen(float f, float d)
	{
		setVorschubgeschwindigkeit(0);
		setVorschub(f);
		setWerkstückdurchmesser(d);
	}
	

	
	/**Methode mit dem Namen "vorschubgeschwindigkeitBerechnen", die mit der Drehzahl und dem Vorschub die Vorschubgeschwindigkeit berechnet
	 * @return Ausgeben der berechneten Vorschubgeschwindigkeit
	 */
	public float vorschubgeschwindigkeitBerechnen() 
	{		
		vorschubgeschwindigkeit = drehzahlBerechnen()*getVorschub();
		return vorschubgeschwindigkeit;
	}
	
	
	
	/** Gibt die Variable "vorschub" zurück, da diese als private deklariert wurde;
	 * @return vorschub
	 */
	public float getVorschub() {
		return vorschub;
	}

	
	/** Der lokal gespeicherten Variable "vorschub" einen Wert zuweisen
	 * @param Neuer Wert für "vorschub"
	 */
	public void setVorschub(float vorschub) {
		this.vorschub = vorschub;
	}

	
	
	/** Gibt die Variable "vorschubgeschwindigkeit" zurück, da diese als private deklariert wurde;
	 * @return vorschubgeschwindigkeit
	 */
	public float getVorschubgeschwindigkeit() {
		return vorschubgeschwindigkeit;
	}

	
	/** Der lokal gespeicherten Variable "vorschubgeschwindigkeit" einen Wert zuweisen
	 * @param Neuer Wert für "vorschubgeschwindigkeit"
	 */
	public void setVorschubgeschwindigkeit(float vorschubgeschwindigkeit) {
		this.vorschubgeschwindigkeit = vorschubgeschwindigkeit;
	}
	
	
	/** Gibt die Variable "werkstückdurchmesser" zurück, da diese als private deklariert wurde;
	 * @return werkstückdurchmesser
	 */
	public float getWerkstückdurchmesser() {
		return werkstückdurchmesser;
	}

	
	/** Der lokal gespeicherten Variable "werkstückdurchmesser" einen Wert zuweisen
	 * @param Neuer Wert für "werkstückdurchmesser" 
	 */
	public void setWerkstückdurchmesser(float werkstückdurchmesser) {
		this.werkstückdurchmesser = werkstückdurchmesser;
	}
}