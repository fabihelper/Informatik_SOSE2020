package Aufgabe4;

import javax.swing.*;
import java.awt.*;


public class Zeichnung extends JPanel
{
	public void paint(Graphics g)
	{
		g.drawOval(250, 250, 500, 500);
		g.drawString("Vorlesung",  750, 350);
		g.drawString("Nachbereitung Vorlesung",  200, 300);
		g.drawString("Übung",  200, 550);
		g.drawString("Nachbereitung Übung",  300, 750);
		g.drawString("Selbststudium",  700, 700);
		g.fillArc(250, 250, 500, 500, 0, 108);
		g.setColor(Color.red);
		g.fillArc(250, 250, 500, 500, 108, 54);
		g.setColor(Color.blue);
		g.fillArc(250, 250, 500, 500, 162, 54);
		g.setColor(Color.green);
		g.fillArc(250, 250, 500, 500, 216, 54);
		g.setColor(Color.orange);
		g.fillArc(250, 250, 500, 500, 270, 90);
		

		
	}
}
