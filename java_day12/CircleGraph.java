package java_day12;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;

public class CircleGraph extends JFrame
{
	int[] data = new int[]
	{ 50, 100, 80, 120, 140, 340, 200 };

	Color[] color;

	public CircleGraph()
	{
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}

	public void paint(Graphics g)
	{
		super.paint(g);
		g.setColor(Color.GREEN);
		g.fillOval(100, 100, 150, 150);
		g.setColor(Color.RED);
		g.fillArc(100, 100, 150, 150, 0, 90);
		g.setColor(Color.BLACK);
		g.drawRect(100, 100, 150, 150);
	}

	public static void main(String[] args)
	{
		new CircleGraph();
	}
}
