/**Klassenname: Bohren
 * Beschreibung: Unterklasse von Bearbeiten; bekommt ben�tigte Attribute �bergeben und berechnet die Drehzahl
 * Version: 1
 * Autoren: Gro�kopf, Konstantin und Kronast, Constantin**/

public class Bohren extends Bearbeiten {
	
	/**Konstruktorname: Bohren
	 * Ergebnistyp: keiner
	 * Parameter: float Vc, float d
	 * Beschreibung: �bergibt die eingeben Werte mit den Set-Methoden der Klasse Bearbeiten an die entsprechenden Variablen**/
	public Bohren (float Vc, float d) {
		setSchnittgeschwindigkeit(Vc);
		setDurchmesser(d);
	};
}
