package java_day10;

import java.awt.Color;
import java.awt.Graphics;

public class d10_2 extends Ball // inheritance class Ball (copy everything from class ball)
{
	public void draw(Graphics g)
	{
		g.setColor(new Color(R, G, B));
		g.fillOval((int) pos.getX() - Size, (int) pos.getY() - Size, 2 * Size, 2 * Size);
	}
}
