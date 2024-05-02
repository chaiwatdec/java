package java_day7_rec_class;

public class Fractal
{
	public int numerator; // sess
	public int denominator; // suan

	public Fractal add(Fractal f)
	{
		Fractal result = new Fractal();
		result.denominator = denominator * f.denominator;
		result.numerator = (numerator * f.denominator) + (denominator * f.denominator);
		int gcd = GCD(result.denominator, result.numerator);
		result.denominator /= gcd;
		result.numerator /= gcd;

		return result;
	}

	public Fractal reduce()
	{
		Fractal result = new Fractal();
		int gcd = GCD(result.denominator, result.numerator);
		result.denominator /= gcd;
		result.numerator /= gcd;

		return result;
	}

	public static int GCD(int a, int b)
	{
		if (a > b)
		{

		} else
		{
			int t = a;
			a = b;
			b = t;
		}

		while (b > 0)
		{
			a = a % b;
			int t = a;
			a = b;
			b = t;
		}

		return a;
	}
}
