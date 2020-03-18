package Aufgabe1;
import java.awt.*;
import javax.swing.*;


public class Zeichnung extends JPanel 
{
	public void paint(Graphics g) 
	{
		
		g.setColor(Color.yellow );
		g.drawRect(300, 400, 250, 250);
		
		g.setColor(Color.gray );
		g.drawRect(450, 550, 50, 100);
		
		g.setColor(Color.gray );
		g.drawRect(350, 450, 50, 50);
		
		g.setColor(Color.yellow );
		g.drawLine(300, 400, 425, 200);
		
		g.drawLine(550, 400, 425, 200);
		
		
		
	}
}
