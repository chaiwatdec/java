package java_day9;

public class Vector2 extends Object
{
	double x, y;

	// constructor that is method name same as class, init call from class while new
	// object from class
	public Vector2()
	{
		x = 0;
		y = 0;
	}

	public Vector2(double x, double y)
	{
		this.x = x;
		this.y = y;
	}

	public Vector2 add(Vector2 v)
	{
		Vector2 result = new Vector2();
		result.x = this.x + v.x;
		result.y = this.x + v.y;
		return result;
	}

	public Vector2 sub(Vector2 v)
	{
		Vector2 result = new Vector2();
		result.x = this.x - v.x;
		result.y = this.x - v.y;
		return result;
	}

	public Vector2 mul(double m)
	{
		Vector2 result = new Vector2();
		result.x = this.x * m;
		result.y = this.x * m;
		return result;
	}

	public double dot(Vector2 v)
	{
		double result = (this.x * v.x) + (this.y * v.y);
		return result;
	}

	public double size()
	{
		double result = Math.sqrt(x * x + y * y);
		return result;
	}

	public Vector2 unit()
	{
		double s = size();
		return new Vector2(x / s, y / s);
	}

	public String toString()
	{
		return "(" + x + ", " + y + ")";
	}

}
