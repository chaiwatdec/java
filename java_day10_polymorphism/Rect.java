package java_day10_polymorphism;

import java.awt.Color;
import java.awt.Graphics;

public class Rect extends Ball
{
	public void draw(Graphics g)
	{
		g.setColor(new Color(R, G, B));
		g.fillRect(Size, R, B, G);
	}
}