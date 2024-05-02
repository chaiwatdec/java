package java_day10_polymorphism;

import java.awt.Graphics;
import java.awt.Color;

public class Ball
{
	public int R, G, B, Size;
	public Vector pos, vel; // from class Vector

	public Ball()
	{
		R = (int) (Math.random() * 255);
		G = (int) (Math.random() * 255);
		B = (int) (Math.random() * 255);
		Size = (int) (Math.random() * 100 + 30);

		pos = new Vector();
		pos.x = ((int) (Math.random() * 500));
		pos.y = ((int) (Math.random() * 500));

		vel = new Vector();
		vel.x = ((int) (Math.random() * 10 - 5));
		vel.y = ((int) (Math.random() * 10 - 5));
	}

	public void move()
	{
		pos = pos.add(vel);
	}

	public void draw(Graphics g)
	{
		g.setColor(new Color(R, G, B));
		g.fillOval((int) pos.x, (int) pos.y, Size, Size);
	}
}
