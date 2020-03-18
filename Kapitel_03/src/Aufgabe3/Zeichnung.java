package Aufgabe3;

import javax.swing.*;
import java.awt.*;

public class Zeichnung extends JPanel
{
	public void paint(Graphics g)
	{
		Font font;
		String s = "Monospaced";
		
		GraphicsEnvironment ge =
	    GraphicsEnvironment.getLocalGraphicsEnvironment();
		String[] arfonts = ge.getAvailableFontFamilyNames();
		
		
		/*font = new Font(s, 0, 35);
		g.setFont(font);
		g.drawString(s, 100, 100);

		font = new Font(s, 1, 35);
		g.setFont(font);
		g.drawString(s, 100, 200);

		font = new Font(s, 2, 35);
		g.setFont(font);
		g.drawString(s, 100, 300);*/
		
		for (int i=0; i<arfonts.length; ++i) 
		{
			font = new Font(arfonts[i],Font.PLAIN,15);
			g.setFont(font);
			g.drawString(arfonts[i],10,(i+1)*(15+5));
		}
		
	}
}
