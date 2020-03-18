package Aufgabe4;

public class AutoMain 
{
	public static void main (String[] args)
	{
		Auto a = new Auto("blau", 120, "Opel", 0);
		
		a.beschleunige(120);
		a.bremse(50);
	}
}
