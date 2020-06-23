package Mouse_KeyListener;

/* press a key then use arrows to move it around */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Keys extends JPanel implements KeyListener {

	char currkey='A';
	int currx=180;
	int curry=100;

	Keys() {
		setFont(new Font("Helvetica", Font.BOLD, 36));
		addKeyListener(this);
		setFocusable(true);
		requestFocusInWindow();
	}

	public void keyPressed(KeyEvent evt) {
		switch (evt.getKeyCode()) {
			case KeyEvent.VK_DOWN:
				curry += 5;
				break;
			case KeyEvent.VK_UP:
				curry -= 5;
				break;
			case KeyEvent.VK_LEFT:
				currx -= 5;
				break;
			case KeyEvent.VK_RIGHT:
				currx += 5;
				break;
			default:
				currkey = evt.getKeyChar();
		}
		repaint();
	}
	
	public void paint(Graphics g) {
		// clean the screen
		super.paint(g);
		g.setColor(Color.blue);
		g.drawString(String.valueOf(currkey), currx,curry);
	}

	public void keyTyped(KeyEvent evt) {}
	public void keyReleased(KeyEvent evt) {}
  
	public static void main(String[] args) {
		JFrame fenster = new JFrame("Zeichen verschieben");
		Keys klickfeld = new Keys();
		
		fenster.setContentPane(klickfeld);
		fenster.setSize(400,400);
		fenster.setVisible(true);
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
  
}






