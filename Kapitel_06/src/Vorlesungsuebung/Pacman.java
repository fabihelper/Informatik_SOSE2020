package Vorlesungsuebung;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Pacman extends JPanel
{
	public void paint(Graphics g) 
	{
		Graphics2D g2 = (Graphics2D) g;
		
		Color dark_green = new Color(69,139,0);
		
		g2.setColor(dark_green);
		BasicStroke pen = new BasicStroke(10f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
		g2.setStroke(pen);
		
		Arc2D.Float pac = new Arc2D.Float(100,100,500,500,390,305, Arc2D.PIE);
		g2.draw(pac);
		Color green = new Color(154,205,50);
		g2.setColor(green);
		g2.fill(pac);
		
		
		
	}
}
