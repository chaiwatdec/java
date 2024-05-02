package java_day13;

public class Point
{
	private double x, y;

	public Point()
	{
		x = 0;
		y = 0;
	}

	public Point(double x, double y)
	{
		this.x = x;
		this.y = y;
	}

	public Point(Point p)
	{
		this.x = p.x;
		this.y = p.y;
	}

	public double getX()
	{
		return x;
	}

	public double getY()
	{
		return y;
	}

	public void setX(double x)
	{
		this.x = x;
	}

	public void setY(double y)
	{
		this.y = y;
	}

	public double distance(Point p)
	{
		return Math.sqrt((x - p.x) * (x - p.x) + (y - p.y) * (y - p.y));
	}

	public int getQuadrant()
	{
		if (x >= 0 && y >= 0)
		{
			return 1;
		} else if ((x < 0 && y >= 0))
		{
			return 2;
		} else if ((x < 0 && y < 0))
		{
			return 3;
		} else
		{
			return 4;
		}
	}

	public boolean equals(Point p)
	{
		return x == p.x && y == p.y;
	}

	public String toString()
	{
		return "(" + x + ", " + y + ")";
	}
}
