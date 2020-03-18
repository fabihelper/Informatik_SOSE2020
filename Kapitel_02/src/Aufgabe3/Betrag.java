package Aufgabe3;


public class Betrag 
{
	int kontostandNeu;
	int dispoNeu;
	
	Betrag(int kontostand, int dispo)
	{
		kontostandNeu = kontostand;
		dispoNeu = dispo;
	}
	void anzeigen()
	{
		System.out.println(kontostandNeu);
	}

	public int getKontostand()
	{
		return kontostandNeu;
	}
	void verringern(int betrag) 
	{
		kontostandNeu = kontostandNeu- betrag;

	}
	
	void erhoehen(int betrag) 
	{
		kontostandNeu = kontostandNeu + betrag;

	}

}
