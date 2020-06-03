package Aufgabe1;

public class Hauptprogramm
{
	public static void main(String[] args)
	{
		BarkingDog hunde[] = new BarkingDog[3];
		
		hunde[0] = new Chihuahua();
		hunde[1] = new GoldenRetriever();
		hunde[2] = new GreateDane();
		
		for(int i =0; i<3;++i)
		{
			hunde[i].bark();
		}
	}
}
