import java_day9.Vector2;

public class Vector extends Object
{
	double x, y;

	// constructor that is method name same as class, init call from class while new
	// object from class
	public Vector()
	{
		x = 0;
		y = 0;
	}

	public Vector(double x, double y)
	{
		this.x = x;
		this.y = y;
	}

	public Vector add(Vector v)
	{
		Vector result = new Vector();
		result.x = this.x + v.x;
		result.y = this.x + v.y;
		return result;
	}

	public Vector sub(Vector v)
	{
		Vector result = new Vector();
		result.x = this.x - v.x;
		result.y = this.x - v.y;
		return result;
	}

	public Vector mul(double m)
	{
		Vector result = new Vector();
		result.x = this.x * m;
		result.y = this.x * m;
		return result;
	}

	public double dot(Vector v)
	{
		double result = (this.x * v.x) + (this.y * v.y);
		return result;
	}

	public double size()
	{
		double result = Math.sqrt(x * x + y * y);
		return result;
	}

	public Vector unit()
	{
		double s = size();
		return new Vector(x / s, y / s);
	}

	public String toString()
	{
		return "(" + x + ", " + y + ")";
	}

	
}
