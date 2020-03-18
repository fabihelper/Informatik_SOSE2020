

public class Girobanking 
{
	public static void main(String[] args)
	{
		//BASIC
		Girokonto jochensKonto = new Girokonto("Jochen", "012345", 520, 15, 1999);
		Girokonto lenasKonto = new Girokonto("Lena", "987654", 2100, 20, 1975);
		
		//ADDED
		Girokonto hanssKonto = new Girokonto("Hans", "167853", 894, 56, 1948);
		Girokonto sibillesKonto = new Girokonto("Sibille", "146781", 7641, 598, 1986);
		
		
		//BASIC
		Betrag schulden = new Betrag(100, 0);
		
		/*jochensKonto.betragUeberweisen(schulden.getKontostand(), lenasKonto);
			jochensKonto.kontoanzeigen();
			lenasKonto.kontoanzeigen();*/
			
		//ADDED
		
			Betrag ueberweisung = new Betrag(200, 0);
			
			System.out.print("Vorher ");
			hanssKonto.kontoanzeigen();
			sibillesKonto.kontoanzeigen();
			hanssKonto.betragUeberweisen(ueberweisung.getKontostand(), sibillesKonto);
			System.out.print("Nacher ");
			hanssKonto.kontoanzeigen();
			sibillesKonto.kontoanzeigen();
			
			
			
		
	}
}
