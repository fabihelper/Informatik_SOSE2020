package Mouse_KeyListener;

/* draw lines at each click and drag */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Lines extends JPanel 
		implements MouseListener, MouseMotionListener {

	final int MAXLINES = 10;
	Point starts[] = new Point[MAXLINES]; // starting points
	Point ends[] = new Point[MAXLINES];    // endingpoints
	Point anchor;    // start of current line
	Point currentpoint; // current end of line
	int currline = 0; // number of lines

	Lines() {
		addMouseListener(this);
		addMouseMotionListener(this);
	}

	public void mousePressed(MouseEvent evt) {
		if (currline < MAXLINES)
			anchor = new Point(evt.getX(),evt.getY());
		
		else
			System.out.println("Too many lines.");

	}

 	public void mouseReleased(MouseEvent evt) {
 		if (currline < MAXLINES)
 			addline(evt.getX(),evt.getY());
	}

	public void mouseDragged(MouseEvent evt) {
		if (currline < MAXLINES) {
			currentpoint = new Point(evt.getX(),evt.getY());
			repaint(); //Veranlasst Aufruf von paint()
		}
	}

 	void addline(int x,int y) {
 		starts[currline] = anchor;
 		ends[currline] = new Point(x,y);
 		currline++;
 		currentpoint = null;
 		anchor = null;
 		repaint();
	}

	public void paint(Graphics g) {
		// clean the screen
		super.paint(g);

		// Draw existing lines
		for (int i = 0; i < currline; i++) {
			g.drawLine(starts[i].x, starts[i].y, ends[i].x, ends[i].y);
		}

		// draw current line
		g.setColor(Color.blue);
		if (currentpoint != null)
			g.drawLine(anchor.x,anchor.y, currentpoint.x,currentpoint.y);
	}
	
	public void mouseClicked(MouseEvent evt) {
		if(evt.getClickCount()== 2)
		{
			currline = 0;
			repaint();
		}
	}

	public void mouseMoved(MouseEvent evt) {}
	public void mouseEntered(MouseEvent evt) {};
	public void mouseExited(MouseEvent evt) {};
	
	public static void main(String[] args) {
		JFrame fenster = new JFrame("Linien");
		Lines klickfeld = new Lines();
		
		fenster.setContentPane(klickfeld);
		fenster.setSize(400,400);
		fenster.setVisible(true);
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
