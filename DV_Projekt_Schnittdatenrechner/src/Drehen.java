/**Klassenname: Drehen;
 * Beschreibung: Berechnet die Vorschubgeschwindigkeit, mit den übergebenen Attributen; ist eine Unterklasse von Bearbeiten;
 * @version 1.0
 * @author Tom Mutschler 
 */

public class Drehen extends Bearbeiten {
	
	/**Variable um den VorschubDrehen zu speichern**/
	private float vorschubDrehen;
	/**Variable um die Vorschubgeschwindigkeit zu speichern**/
	private float vorschubgeschwindigkeit;
	/**Variable um die DrehzahlDrehen zu speichern**/
	private float drehzahlDrehen;
	
	
	/**
	 * Zweiter Konstuktor 
	 */
	public Drehen ()
	{
		drehzahlDrehen = 1000;
		vorschubgeschwindigkeit = 20;
		vorschubDrehen = 5 ;
	}
	
	/**
	 * Kostruktor um die übergebenen Attribute in den Variablen drehzahlDrehen und vorschubDrehen zu speichern
	 * @param drehzahl Das Attribut Drehzahl, dass der Klasse Drehen übergeben wird
	 * @param vorschub Das Attribut Vorschub, dass der Klasse Drehen übergeben wird
	 */
	public Drehen(float drehzahl, float vorschub)
	{
		drehzahlDrehen = drehzahl;
		vorschubgeschwindigkeit = 0;
		vorschubDrehen = vorschub ;
	}
	

	
	/**Methode mit dem Namen "vorschubgeschwindigkeitBerechnen", die mit den Parametern drehzahlDrehen und vorschubDrehen die Vorschubgeschwindigkeit berechnet
	 * @return Ausgeben der berechneten Vorschubgeschwindigkeit
	 */
	public float vorschubgeschwindigkeitBerechnen() 
	{		
		vorschubgeschwindigkeit = drehzahlDrehen*vorschubDrehen;
		return vorschubgeschwindigkeit;
	}
	
	
	/** Gibt die Variable "vorschubDrehen" zurück, da diese als private deklariert wurde;
	 * @return lokal gespeicherte Variable "vorschubDrehen"
	 */
	public float getvorschubDrehen() {
		return vorschubDrehen;
	}

	
	/** Der lokal gespeicherten Variable "vorschubDrehen" einen Wert zuweisen
	 * @param vorschubDrehen Variable "vorschubDrehen" mit neuem Wert
	 */
	public void setvorschubDrehen(float vorschubDrehen) {
		this.vorschubDrehen = vorschubDrehen;
	}

	
	/** Gibt die Variable "drehzahlDrehen" zurück, da diese als private deklariert wurde;
	 * @return lokal gespeicherte Variable "drehzahlDrehen"
	 */
	public float getdrehzahlDrehen() {
		return drehzahlDrehen;
	}

	
	/** Der lokal gespeicherten Variable "drehzahlDrehen" einen Wert zuweisen
	 * @param drehzahlDrehen Variable "drehzahlDrehen" mit neuem Wert
	 */
	public void setdrehzahlDrehen(float drehzahlDrehen) {
		this.drehzahlDrehen = drehzahlDrehen;
	}
}