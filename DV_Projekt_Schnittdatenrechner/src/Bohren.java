/**
 * Klassenname: Bohren;
 * Beschreibung: Unterklasse von Bearbeiten; bekommt ben�tigte Attribute �bergeben und berechnet die Drehzahl;
 * Version: 1;
 * Autoren: Gro�kopf, Konstantin und Kronast, Constantin
 */

public class Bohren extends Bearbeiten {
	
	/**
	 * �bergibt die eingegebenen Werte mit den Set-Methoden der Klasse Bearbeiten an die entsprechenden Variablen
	 * @param Vc �bergibt die Schnittgeschwindigkeit
	 * @param d �bergibt den Bohrerdurchmesser
	 */
	public Bohren (float Vc, float d) throws Exception {
		setSchnittgeschwindigkeit(Vc);
		setDurchmesser(d) ;
	};
	
	/**
	 * Setzt mit hilfe der set-Methoden die Werte Durchmesser und Schnittgeschwindigkeit auf vorgegebene Werte
	 */
	 public Bohren() throws Exception {
		 setSchnittgeschwindigkeit(100);
		 setDurchmesser(15);
	 };
	 
}
