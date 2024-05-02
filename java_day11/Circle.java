package java_day11;

public class Circle
{
	private double r, area;

	public void setR(double rr)
	{
		r = rr;
		area = r * r * Math.PI;
	}

	public double getR()
	{
		return r;
	}

	public double getArea()
	{
		return area;
	}

	public static void main(String[] args)
	{
		Circle c = new Circle();
		c.setR(10);
	}
}
