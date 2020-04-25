package Aufgabe5;

import java.awt.Color;

import javax.swing.*;

public class Muster 
{
	public static void main(String[] args)
	{
		JFrame mus = new JFrame("Muster");
		Zeichnung z = new Zeichnung();

		mus.setContentPane(z);
		mus.setBackground(Color.white);
		
		mus.setSize(1000, 1000);
		mus.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mus.setVisible(true);
	}
}
