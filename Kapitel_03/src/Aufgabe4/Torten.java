package Aufgabe4;

import javax.swing.*;

public class Torten 
{
	public static void main(String[] args)
	{
		JFrame torte = new JFrame("Tortendiagramm");
		Zeichnung z = new Zeichnung();
		torte.setContentPane(z);
		
		torte.setSize(1000, 1000);
		torte.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		torte.setVisible(true);
	}
}
