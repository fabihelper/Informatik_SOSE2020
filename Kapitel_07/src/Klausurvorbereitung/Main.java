package Klausurvorbereitung;

import javax.swing.*;
import java.awt.*;

public class Main extends JPanel
{
	int zeile = 0;
	int spalte = 0;
	int max = 9;
	
	public void paint(Graphics g)
	{
		for(spalte = 0 ;spalte < max*20; spalte+= 20)
		{
			for(zeile =0 ;zeile < max*20; zeile+= 20)
			{
				if(zeile == spalte || spalte == max*20-20  - zeile)
				{
					g.setColor(Color.blue);
					g.fillRect(spalte, zeile, 20, 20);
				}
				else
				{
					g.setColor(Color.black);
					g.drawLine(zeile+5, spalte+10, zeile+15, spalte+10);
				}
				
			}
		}
	}
	
	public static void main (String[] args)
	{
		JFrame fenster = new JFrame("Main");
		Main pane = new Main();
		fenster.setContentPane(pane);
		
		fenster.setSize(1000, 1000);
		fenster.setVisible(true);
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
