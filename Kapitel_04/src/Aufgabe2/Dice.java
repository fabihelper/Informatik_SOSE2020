package Aufgabe2;

import java.util.Random;

public class Dice 
{
	public static int roll(int d) // d - Anzahl der Würfelseiten
	{
		Random generator = new Random();
		return generator.nextInt(d)+1;
	}
	
	public static void main (String[] args)
	{
		System.out.print(roll(12));
	}
}
