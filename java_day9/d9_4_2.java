package java_day9;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class d9_4_2 extends JFrame
{
	public d9_4_2()
	{
		setSize(600, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public void paint(Graphics g)
	{
		super.paint(g);
		g.fillOval((50), 50, 100, 150);
		g.setColor(Color.red);
		g.fillRect(200, 50, 100, 200);
	}

	public static void main(String[] args)
	{
		new d9_4_2();
	}
}
