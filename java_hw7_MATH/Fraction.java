package java_hw7_MATH;

public class Fraction
{
	public int N, D;

	public Fraction add(Fraction f)
	{
		Fraction result = new Fraction();
		result.N = (N * f.D) + (D * f.N);
		result.D = D * f.D;

		return result.reduce();
	}

	public Fraction minus(Fraction f)
	{
		Fraction result = new Fraction();
		result.N = (N * f.D) - (f.N * D);
		result.D = D * f.D;

		return result.reduce();
	}

	public Fraction mul(Fraction f)
	{
		Fraction result = new Fraction();
		result.N = N * f.N;
		result.D = D * f.D;

		return result.reduce();
	}

	public Fraction div(Fraction f)
	{
		Fraction result = new Fraction();
		result.N = N * f.D;
		result.D = D * f.N;

		if (result.D < 0)
		{
			result.N = result.N * -1;
			result.D = result.D * -1;
		}

		return result.reduce();
	}

	public Fraction reduce()
	{
		Fraction result = new Fraction();
		result.N = N;
		result.D = D;
		int fgcd = gcd(result.N, result.D);
		result.N = result.N / fgcd;
		result.D = result.D / fgcd;

		return result;
	}

	public static Fraction max(Fraction a, Fraction b)
	{
		int va, vb;
		va = a.N * b.D;
		vb = b.N * a.D;

		if (va > vb)
		{
			return a.reduce();
		} else
		{
			return b.reduce();
		}
	}

	public static int gcd(int a, int b)
	{
		a = Math.abs(a);
		b = Math.abs(b);

		if (a < b)
		{
			int temp = a;
			a = b;
			b = temp;
		}

		while (b != 0)
		{
			int temp = b;
			b = a % b;
			a = temp;
		}

		return a;
	}
}