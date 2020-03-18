package Aufgabe1;

import java.awt.Color;

import javax.swing.*;


public class Haus 
{
	public static void main(String[] args)
	{
		JFrame hause = new JFrame("Haus");
		Zeichnung z = new Zeichnung();
		hause.setContentPane(z);
		hause.setBackground(Color.black);
		
		hause.setSize(1000, 1000);
		hause.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		hause.setVisible(true);
		
		
		
	}	
}
