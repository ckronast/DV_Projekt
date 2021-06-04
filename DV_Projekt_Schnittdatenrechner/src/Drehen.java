
public class Drehen extends Bearbeiten {
	
	private float vorschubDrehen;
	private float vorschubgeschwindigkeit;
	private float drehzahlDrehen;
	
	
	public Drehen ()
	{
		drehzahlDrehen = 1000;
		vorschubgeschwindigkeit = 20;
		vorschubDrehen = 5 ;
	}
	
	public Drehen(float drehzahl, float vorschub)
	{
		drehzahlDrehen = drehzahl;
		vorschubgeschwindigkeit = 0;
		vorschubDrehen = vorschub ;
	}
	

	
	public float vorschubgeschwindigkeitBerechnen() 
	{		
		vorschubgeschwindigkeit = drehzahlDrehen*vorschubDrehen;
		return vorschubgeschwindigkeit;
	}
}
