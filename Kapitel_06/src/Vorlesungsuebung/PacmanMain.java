package Vorlesungsuebung;

import javax.swing.*;

public class PacmanMain 
{
	public static void  main(String[] args)
	{
		JFrame window = new JFrame("Pacman");
		Pacman pac = new Pacman();
		window.setContentPane(pac);
		
		window.setSize(1000, 1000);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
