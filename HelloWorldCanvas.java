import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Canvas;
public class HelloWorldCanvas extends Canvas
{
	public void paint(Graphics g)
	{
		g.drawString("Hello,World!",30,50); 
	}
	public static void main(String args[])
	{
		HelloWorldCanvas obj=new HelloWorldCanvas();
		JFrame f=new JFrame();
		f.add(obj);
		f.setSize(200,300); 
		f.setVisible(true);
	}
}
