package Vorlesungsuebung;

import javax.swing.*;

public class SpotsMain 
{
	public static void main(String[] args)
	{
		JFrame fenster = new JFrame("Punkte");
		Spots pts = new Spots();
		
		fenster.setContentPane(pts);
		fenster.setSize(1000,1000);
		fenster.setVisible(true);
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
