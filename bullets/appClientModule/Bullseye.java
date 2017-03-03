import java.awt.Graphics;
import javax.swing.JApplet;

///because I'm not sure how to place or use the bullseye Applet (saving or creation type error?)
	public class Bullseye extends JApplet
	{
		public void paint(Graphics canvas)
		{
		canvas.drawOval(100, 50, 200, 200);
		canvas.drawOval(125, 75, 150, 150);
		canvas.fillOval(175, 125, 50, 50);
		}
	
	}