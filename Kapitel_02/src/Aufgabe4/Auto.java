package Aufgabe4;

public class Auto 
{
	String farbe;
	int ps;
	String marke;
	int geschwindigkeit;
	
	public Auto(String f, int p, String m, int g)
	{
		f = farbe;
		p = ps;
		m = marke;
		g = geschwindigkeit;
	}
	
	public void beschleunige(int geschwindigkeit)
	{
		this.geschwindigkeit = geschwindigkeit;
	}
	
	public void bremse(int geschwindigkeit)
	{
		this.geschwindigkeit = geschwindigkeit;
	}
}
