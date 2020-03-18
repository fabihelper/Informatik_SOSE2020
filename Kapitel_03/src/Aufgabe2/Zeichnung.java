package Aufgabe2;

import java.awt.*;
import javax.swing.*;

public class Zeichnung extends JPanel
{
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		
		g.fillOval(450, 300, 30, 30);
		
		g.setColor(Color.yellow);
		
		g.fillOval(450, 350, 30, 30);
		
		g.setColor(Color.green);
		
		g.fillOval(450, 400, 30, 30);
		
		g.setColor(Color.gray);
		g.drawRect(440, 275, 50, 175);
		
		g.drawRect(450, 450, 30, 100);
	}

}
