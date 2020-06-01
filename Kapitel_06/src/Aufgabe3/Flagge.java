package Aufgabe3;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class Flagge extends JPanel 
{
	public void paint (Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		BasicStroke pen = new BasicStroke(10f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
		g2.setStroke(pen);
		g2.setBackground(Color.white);	
		g2.drawRect(50, 100, 350, 200);

		Rectangle2D.Float rc1 = new Rectangle2D.Float(50, 100, 150, 200);
		Rectangle2D.Float rc2 = new Rectangle2D.Float(200, 100, 200, 200);
		
		GradientPaint pa1 = new GradientPaint(50, 100f, Color.red, 175, 100f, Color.white, false);
		g2.setPaint(pa1);
		g2.fill(rc1);
		GradientPaint pa2 = new GradientPaint(350, 50, Color.green, 275, 50, Color.white, false);
		g2.setPaint(pa2);
		g2.fill(rc2);
		
	}
}
