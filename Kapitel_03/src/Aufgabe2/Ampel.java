package Aufgabe2;

import javax.swing.*;

public class Ampel 
{
	public static void main(String[] args)
	{
		JFrame ampeln = new JFrame("Ampeln");
		Zeichnung z = new Zeichnung();
		ampeln.setContentPane(z);
		
		
		ampeln.setSize(1000,1000);
		ampeln.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ampeln.setVisible(true);
		
	}
}
