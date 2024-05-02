package java_day10_polymorphism;

public class Vector
{
	public double x, y;

	public Vector add(Vector v)
	{
		Vector result = new Vector();
		result.x = x + v.x;
		result.y = y + v.y;

		return result;
	}

	public Vector sub(Vector v)
	{
		Vector result = new Vector();
		result.x = x - v.x;
		result.y = y - v.y;

		return result;
	}

	public Vector mul(Vector v)
	{
		Vector result = new Vector();
		result.x = (x * v.x) + (y + v.y);

		return result;
	}

}
