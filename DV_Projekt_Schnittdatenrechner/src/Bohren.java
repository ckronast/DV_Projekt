/**Klassenname: Bohren
 * Beschreibung: Unterklasse von Bearbeiten; bekommt benötigte Attribute übergeben und berechnet die Drehzahl
 * Version: 1
 * Autoren: Großkopf, Konstantin und Kronast, Constantin**/

public class Bohren extends Bearbeiten {
	
	/**Konstruktorname: Bohren
	 * Ergebnistyp: keiner
	 * Parameter: float Vc, float d
	 * Beschreibung: übergibt die eingegebenen Werte mit den Set-Methoden der Klasse Bearbeiten an die entsprechenden Variablen**/
	public Bohren (float Vc, float d) {
		setSchnittgeschwindigkeit(Vc);
		setDurchmesser(d);
	};
}
