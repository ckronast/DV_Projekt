/**Klassenname: Bohren;
 * Beschreibung: Unterklasse von Bearbeiten; bekommt ben�tigte Attribute �bergeben und berechnet die Drehzahl;
 * Version: 1;
 * Autoren: Gro�kopf, Konstantin und Kronast, Constantin**/

public class Bohren extends Bearbeiten {
	
	/**Konstruktorname: Bohren;
	 * Ergebnistyp: keiner;
	 * Parameter: float Vc, float d;
	 * Beschreibung: �bergibt die eingegebenen Werte mit den Set-Methoden der Klasse Bearbeiten an die entsprechenden Variablen**/
	public Bohren (float Vc, float d) {
		setSchnittgeschwindigkeit(Vc);
		setDurchmesser(d);
	};
	
	/**Konstruktorname: Bohren_Beispiel;
	 * Ergebnistyp: keiner;
	 * Parameter: keine;
	 * Beschreibung: setzt die Werte Durchmesser und Schnittgeschwindigkeit auf vorgegebene Werte
	 *  **/
	 public Bohren() {
		 setSchnittgeschwindigkeit(100);
		 setDurchmesser(15);
	 };
	 
}
