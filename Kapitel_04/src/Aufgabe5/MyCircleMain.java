package Aufgabe5;

import java.text.*;

public class MyCircleMain 
{
	public static void main(String[] args)
	{
		DecimalFormat f =new DecimalFormat("#0.00");
		
		
		MyCircle kreis1 = new MyCircle(5);
		MyCircle kreis2 = new MyCircle(2.4);
		MyCircle kreis3 = new MyCircle(7);
		MyCircle kreis4 = new MyCircle(9);
		
		
		
		System.out.println("FLÄCHEN");
		
		System.out.println(f.format(kreis1.berechneFlaeche()));
		System.out.println(f.format(kreis2.berechneFlaeche()));
		System.out.println(f.format(kreis3.berechneFlaeche()));
		System.out.println(f.format(kreis4.berechneFlaeche()));
		
		
		System.out.println("UMFANG");
		
		System.out.println(f.format(kreis1.berechneUmfang()));
		System.out.println(f.format(kreis2.berechneUmfang()));
		System.out.println(f.format(kreis3.berechneUmfang()));
		System.out.println(f.format(kreis4.berechneUmfang()));

	}

}
