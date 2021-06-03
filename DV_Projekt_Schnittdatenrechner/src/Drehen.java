
public class Drehen extends Bearbeiten {
	
	private float vorschub;
	private float vorschubgeschwindigkeit;
	private float drehzahlDrehen;
	
	public Drehen(float drehzahl)
	{
		drehzahlDrehen = drehzahl;
		vorschubgeschwindigkeit = 0;
		vorschub = 0 ;
	}
	
	
	public float vorschubgeschwindigkeitBerechnen() 
	{		
		vorschubgeschwindigkeit = drehzahlDrehen*vorschub;
		return vorschubgeschwindigkeit;
	}
}
