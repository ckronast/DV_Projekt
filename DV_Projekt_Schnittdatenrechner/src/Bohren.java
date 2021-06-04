/**Unterklasse von Bearbeiten**/
public class Bohren extends Bearbeiten {
	
	/**Konstruktor der Klasse Bohren; übergibt die eingeben Werte mit den Set-Methoden der Klasse Bearbeiten an die entsprechenden Variablen**/
	public Bohren (float Vc, float d) {
		setSchnittgeschwindigkeit(Vc);
		setDurchmesser(d);
	};
}
