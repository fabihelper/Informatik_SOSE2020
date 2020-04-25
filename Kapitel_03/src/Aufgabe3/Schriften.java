package Aufgabe3;



import javax.swing.*;



public class Schriften 
{
	public static void main(String[] args)
	{
		JFrame schrift = new JFrame("Schriften Übungen");
		Zeichnung z = new Zeichnung();
		schrift.setContentPane(z);

		schrift.setSize(1000, 1000);
		schrift.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		schrift.setVisible(true);
	}
}
