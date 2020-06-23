package ActionListener;

import javax.swing.*;

public class KreisMain 
{
	public static void main (String[] args)
	{
		JFrame window = new JFrame("Roter Kreis");
		Kreis circle = new Kreis();
		
		window.setContentPane(circle);
		window.setSize(1000, 1000);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
