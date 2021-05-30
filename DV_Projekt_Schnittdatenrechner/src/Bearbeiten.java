
public class Bearbeiten {
	
	protected float schnittgeschwindigkeit;
	protected float bohrerdurchmesser;
	
	public float drehzahlBerechnen() {
		float drehzahl;
		drehzahl =(float) (schnittgeschwindigkeit/(Math.PI*bohrerdurchmesser));
		return drehzahl;
	}

}
