package java_hw7_MATH;

public class Complex
{
	public double a, b;

	public Complex add(Complex c)
	{
		Complex result = new Complex();
		result.a = a + c.a;
		result.b = b + c.b;

		return result;
	}

	public Complex minus(Complex c)
	{
		Complex result = new Complex();
		result.a = a - c.a;
		result.b = b - c.b;

		return result;
	}

	public Complex mul(Complex c)
	{
		Complex result = new Complex();
		result.a = (a * c.a) - (b * c.b);
		result.b = (a * c.b + b * c.a);

		return result;
	}

	public Complex div(Complex c)
	{
		Complex result = new Complex();
		double c2d2 = c.a * c.a + c.b * c.b;
		result.a = (a * c.a + b * c.b) / c2d2;
		result.b = (b * c.a - a * c.b) / c2d2;

		return result;
	}

	public Complex inv()
	{
		Complex result = new Complex();
		double d = (a * a) + (b * b);
		result.a = a / d;
		result.b = -1 * b / d;

		return result;
	}

	public Complex conj()
	{
		Complex result = new Complex();
		result.a = a;
		result.b = -1 * b;

		return result;
	}

	public double size()
	{
		return Math.sqrt(a * a + b * b);
	}

	public double angle()
	{
		return Math.atan2(b, a);
	}
}