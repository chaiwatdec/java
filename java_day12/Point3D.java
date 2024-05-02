package java_day12;

public class Point3D extends Point
{
	public double z;

	public Point3D()
	{
	}

	public Point3D(double xx, double yy, double zz)
	{
		super(xx, yy);
		z = zz;
	}

	public double size_of_vector_to_this_point()
	{
		return Math.sqrt(Math.pow(x, 2) + (Math.pow(y, 2)) + (Math.pow(x, 2)));
	}
}
