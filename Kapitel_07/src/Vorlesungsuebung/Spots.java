package Vorlesungsuebung;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Spots extends JPanel implements MouseListener {

	final int MAXSPOTS = 10;
	int xspots[] = new int[MAXSPOTS];
	int yspots[] = new int[MAXSPOTS];
	int currspots = 0;
	boolean[] farbe = new boolean[10];


	Spots() {
    	addMouseListener(this);
    	//Wir koennen Methode aufrufen weil implizit ein this.addMouselistener erfolgt
    	//addMouseListener ist eine Methode von Component
    	//Spots erbt ueber JPanel von Component
    	//Methode addMouseListener erwart MouseListener 
    	//this ist natuerlich vom Typ MouseListener -> da implements
    }
    	
    public void mousePressed(MouseEvent evt) {
    		
    	if (currspots < MAXSPOTS) {

        	if(evt.getButton() == MouseEvent.BUTTON1)
        	{
        		farbe[currspots] = true;
        	}
        	else
        	{
        		farbe[currspots] = false;
        	}
        	xspots[currspots] = evt.getX();
        	yspots[currspots] = evt.getY();
        	currspots++;
        	repaint();
    	}
    	else
    		System.out.println("Too many spots.");
	}

	public void paint(Graphics g) {

	
		for (int i = 0; i < currspots; i++) 
			if(farbe[i])
			{	g.setColor(Color.red);
				g.fillOval(xspots[i] - 10, yspots[i] - 10, 20, 20);
			}
			else
			{
				g.setColor(Color.green);
				g.fillOval(xspots[i] - 10, yspots[i] - 10, 20, 20);
			}
	}
	
	

	public void mouseClicked(MouseEvent evt) {};
	public void mouseEntered(MouseEvent evt) {};
	public void mouseExited(MouseEvent evt) {};
	public void mouseReleased(MouseEvent evt) {};

	
}
