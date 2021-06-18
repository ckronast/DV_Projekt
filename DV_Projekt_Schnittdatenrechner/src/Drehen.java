/**Klassenname: Drehen;
 * Beschreibung: Berechnet die Vorschubgeschwindigkeit, mit den �bergebenen Attributen; ist eine Unterklasse von Bearbeiten;
 * @version 1.1
 * @author Tom Mutschler 
 */

public class Drehen extends Bearbeiten {
	
	/**Variable um den Vorschub zu speichern**/
	private float vorschub;
	/**Variable um den Werkst�ckdurchmesser zu speichern**/
	private float werkst�ckdurchmesser;
	
	
	
	/**
	 * Zweiter Konstuktor 
	 */
	public Drehen () throws Exception
	{
		setVorschub(5);
		setWerkst�ckdurchmesser(10);
	}
	
	/**
	 * Kostruktor um die �bergebenen Attribute in den Variablen "vorschub" und "durchmesser" zu speichern
	 * @param f �bergibt der Klasse Drehen den Vorschub
	 * @param d �bergibt der Klasse Drehen den Werkst�ckdurchmesser
	 */
	public Drehen(float f, float d) throws Exception
	{
		setVorschub(f);
		setWerkst�ckdurchmesser(d);
	}
	

	
	/**Methode mit dem Namen "vorschubgeschwindigkeitBerechnen", die mit der Drehzahl und dem Vorschub die Vorschubgeschwindigkeit berechnet
	 * @return Ausgeben der berechneten Vorschubgeschwindigkeit
	 */
	public float vorschubgeschwindigkeitBerechnen() 
	{	
		float vorschubgeschwindigkeit;
		vorschubgeschwindigkeit = drehzahlBerechnen()*getVorschub();
		return vorschubgeschwindigkeit;
	}
	
	
	
	
	
	/** Gibt die Variable "vorschub" zur�ck, da diese als private deklariert wurde;
	 * @return vorschub
	 */
	public float getVorschub() {
		return vorschub;
	}

	
	/** Der lokal gespeicherten Variable "vorschub" einen Wert zuweisen
	 * @param Neuer Wert f�r "vorschub"
	 */
	public void setVorschub(float vorschub) throws Exception{
		if(vorschub>0 && vorschub<0.5)
			this.vorschub = vorschub;
		else 
			throw new Exception("Ung�ltiger Vorschub");
		
	}

	
	
	/** Gibt die Variable "werkst�ckdurchmesser" zur�ck, da diese als private deklariert wurde;
	 * @return werkst�ckdurchmesser
	 */
	public float getWerkst�ckdurchmesser() {
		return werkst�ckdurchmesser;
	}

	
	/** Der lokal gespeicherten Variable "werkst�ckdurchmesser" einen Wert zuweisen
	 * @param Neuer Wert f�r "werkst�ckdurchmesser" 
	 */
	public void setWerkst�ckdurchmesser(float werkst�ckdurchmesser) throws Exception {
		if(werkst�ckdurchmesser>0 && werkst�ckdurchmesser<500)
			this.werkst�ckdurchmesser = werkst�ckdurchmesser;
		else 
			throw new Exception("Ung�ltiger Werkst�ckdurchmesser");
		 
	}
}