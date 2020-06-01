package Aufgabe3;

import java.awt.Color;

import javax.swing.*;

public class FlaggeMain 
{
	public static void main(String[] args)
	{
		JFrame fl = new JFrame("Italien");
		Flagge ar = new Flagge();
		fl.setContentPane(ar);
		fl.setBackground(Color.white);
		
		fl.setSize(1000,1000);
		fl.setVisible(true);
		fl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
