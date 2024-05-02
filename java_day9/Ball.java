package java_day9;

import java.awt.Graphics;
import java.awt.Color;

public class Ball
{
	public int R, G, B, Size;
	public Vector Pos, Vel, Acc; // from class Vector

	public void draw(Graphics g)
	{
		g.setColor(new Color(R, G, B));
		g.fillOval((int) Pos.x, (int) Pos.y, Size, Size);
	}
}
