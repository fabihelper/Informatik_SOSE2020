package ActionListener;

import javax.swing.*;
import java.awt.*;

public class Kreis extends JPanel
{
	JPanel panel = new JPanel();
	MyCanvas mcv = new MyCanvas();
	
	Kreis()
	{
		setLayout(new GridLayout(2, 1, 10, 10));
		JButton button = new JButton("rot");
		panel.add(button);
		add(mcv);
		add(panel);
		
	}
	
	class MyCanvas extends Canvas
	{
		public void paint(Graphics g)
		{
			Graphics2D g2d = (Graphics2D)g;
			g2d.setColor(Color.white);
			g2d.fillRect(0, 0, getWidth(), getHeight());
/*			BasicStroke test = new BasicStroke(5f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
			g2d.setColor(Color.black);
			g2d.setStroke(test);
			
			g2d.drawOval(445, 200, 100, 100);*/
			g2d.setColor(Color.red);
			g2d.fillOval(445, 200, 100, 100);
			
		}
	}
}
