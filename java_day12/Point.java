package java_day12;

public class Point implements Cloneable
{
	public double x, y;

	public Point()
	{

	}

	public Point(double x, double y)
	{
		this.x = x;
		this.y = y;
	}

	public String toString()
	{
		return String.format(("%f,%f"), x, y);
	}

	public Point copyAll()
	{
		return new Point(this.x, this.y);
	}

	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}

	public static double getDistance(Point p1, Point p2)
	{

		return Math.sqrt(Math.pow(p1.x - p2.x, 2) + (Math.pow(p1.y - p2.y, 2)));
	}

	public double size_of_vector_to_this_point()
	{
		return Math.sqrt(Math.pow(x, 2) + (Math.pow(y, 2)));
	}

	public final void xxx() // cannot reuse in childclass (Point3D)
	{
		System.out.println("shit shit shit");
	}
}
