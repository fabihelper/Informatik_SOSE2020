package Aufgabe4;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Polygon extends JPanel
{
	public void paint(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g; 
		BasicStroke pen = new BasicStroke(10f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
		g2.setStroke(pen);
		
		int exes[] = {150, 300, 350, 400, 550, 400, 350, 300};
		int whys[] = {400, 350, 200, 350, 400, 450, 600, 450};
		int pts = exes.length;
		
		
		g2.drawPolygon(exes, whys, pts);
		GradientPaint pa1 = new GradientPaint(150, 350, Color.yellow, 150, 400, Color.red, true);
		g2.setPaint(pa1);
		g2.fillPolygon(exes, whys, pts);
		
	}
}
