package Aufgabe5;

import javax.swing.*;
import java.awt.*;

public class Zeichnung extends JPanel
{
	int hoehe = 50*10;

	
	public void paint(Graphics g)
	{

			for(int i = 10; i <= hoehe; i=i+10)
			{
		
	            for (int j = 10; j <= i; j=j+10) { 
	            	
	            	//*Mit Sternen
	            	/*g.setColor(Color.BLUE);
	            	g.drawString("+ ", i+510, j); 
	            	g.drawString("+ ", i*-1+510, j);
	            	g.setColor(Color.RED);
	            	g.drawString("* ", j+500, i); 
	            	g.drawString("* ", j*-1+520, i);*/
	            	
	            	// Mit Kreisen
	            	  
	            	g.setColor(Color.BLUE);
	            	g.drawOval(i+470 , j-10, 10, 10);
	            	g.drawOval(i*-1+490, j-10, 10, 10);

	            	g.setColor(Color.RED);
	            	g.drawOval(j+470, i-10 , 10, 10);

	            	g.drawOval(j*-1+490, i-10, 10, 10);
	            	 


	            } 
				System.out.println();
			}
			
		}
		
		
	
	
}
	

