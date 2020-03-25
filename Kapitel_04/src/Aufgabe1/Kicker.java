package Aufgabe1;

public class Kicker 
{
	String name;
	int geburtsjahr;
	String position;
	int tore;
	public Kicker(String n, int gJ, String p,int t)
	{
		name =n;
		geburtsjahr = gJ;
		position =p;
		tore=t;
		//System.out.printf("Test %s", this);
	}
	@Override
	public String toString() {
		return "Kicker -- Name:" + name + ", Geburtsjahr:" + geburtsjahr + ", Position:" + position + ", tore=" + tore;
	}
	
	
	


}
