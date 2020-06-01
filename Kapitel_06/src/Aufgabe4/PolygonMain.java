package Aufgabe4;
import javax.swing.*;


public class PolygonMain 
{
	public static void main(String[] args)
	{
		JFrame pol = new JFrame("Polygon bunt");
		Polygon ply = new Polygon();
		pol.setContentPane(ply);
		
		
		pol.setSize(1000,1000);
		pol.setVisible(true);		
		pol.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
