package java_day9;

import java.awt.Color;
import java.awt.Graphics;

public class Ball2
{
	public int R, G, B, Size;
	public Vector2 Pos, Vel; // from class Vector2

	public Ball2() // constructor
	{
		R = (int) (Math.random() * 255);
		G = (int) (Math.random() * 255);
		B = (int) (Math.random() * 255);
		Size = (int) (Math.random() * 255);

		Pos = new Vector2((int) (Math.random() * 500), (int) (Math.random() * 500));
		Vel = new Vector2((int) (Math.random() * 10 - 5), (int) (Math.random() * 10 - 5));
	}

	public void move()
	{
		Pos = Pos.add(Vel);
		if (Pos.x + Size > 500)
		{
			Pos.x = 500 - Size;
			Vel.x = Vel.x * -1;
		}

		if (Pos.x < 0)
		{
			Pos.x = 0;
			Vel.x = Vel.x * -1;
		}

		if (Pos.y + Size > 500)
		{
			Pos.y = 500 - Size;
			Vel.y = Vel.y * -1;
		}

		if (Pos.y < 0)
		{
			Pos.y = 0;
			Vel.y = Vel.y * -1;
		}
	}

	public void draw(Graphics g)
	{
		g.setColor(new Color(R, G, B, 200));
		g.fillOval((int) (Pos.x), (int) (Pos.y), Size, Size);
	}

}
