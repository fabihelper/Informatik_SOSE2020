package Aufgabe1;

public class Hauptklasse 
{
	public static void main (String[] args)
	{
		Kicker k = new Kicker("Manuel", 1997, "Tor", 0);
		Kicker k1 = new Kicker("Mario", 1998, "Angriff", 8);
		Kicker k2 = new Kicker("Timo", 1992, "Mittelfeld", 4);
		Kicker k3 = new Kicker("Thomas", 1987, "Abwehr", 1);
		System.out.println(k);
		System.out.println(k1);
		System.out.println(k2);
		System.out.println(k3);
		
	}
}
