import java.sql.Date;

public class Girokonto 
{
	String besitzer;
	String kontonummer;
	int blz;
	Betrag kontostand;
	Betrag dispolimit;
	int geburtsjahr;
	
	Girokonto(String b, String n, int e, int c, int gJ)
	{
		besitzer = b;
		kontonummer = n;
		blz = 64892200;
		kontostand = new Betrag(e, c);
		dispolimit = new Betrag(1000, 0);
		geburtsjahr = gJ;
	}
	
	void kontoanzeigen()
	{
		System.out.print("Kontostand " + besitzer + ": ");
		kontostand.anzeigen();
		System.out.println();
	}
	
	void betragUeberweisen(int schulden, Girokonto girokonto_nach)
	{
		kontostand.verringern(schulden);
		girokonto_nach.betragGutschreiben(schulden);
		
	}
	
	void betragAbheben(int betrag)
	{

	}
	void betragGutschreiben(int schulden)
	{
		kontostand.erhoehen(schulden);
	}
}
