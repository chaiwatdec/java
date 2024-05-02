package java_day9;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class d9_4_3 extends JFrame // copy everything from jframe to d9_4_3
{
	Ball balls[];

	public d9_4_3()
	{
		balls = new Ball[10];
		for (int i = 0; i < balls.length; i++)
		{
			balls[i] = new Ball();
			balls[i].R = (int) (Math.random() * 255);
			balls[i].G = (int) (Math.random() * 255);
			balls[i].B = (int) (Math.random() * 255);
			balls[i].Size = (int) (Math.random() * 255);

			balls[i].Pos = new Vector();
			balls[i].Pos.x = (int) (Math.random() * 500);
			balls[i].Pos.y = (int) (Math.random() * 500);

			balls[i].Vel = new Vector();
			balls[i].Vel.x = (int) (Math.random() * 10 - 5);
			balls[i].Vel.y = (int) (Math.random() * 10 - 5);

			balls[i].Acc = new Vector();
			balls[i].Acc.x = 0;
			balls[i].Acc.y = 0.1;
		}

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		setVisible(true);
	}

	public void paint(Graphics g)
	{
		super.paint(g);
		for (int i = 0; i < balls.length; i++)
		{
			balls[i].draw(g);
		}
	}

	public static void main(String[] args)
	{
		new d9_4_3();
	}

}
