package java_day9;

public class d9_2
{
	public static void main(String[] args)
	{
		Fractal a, b, c, d;
		a = new Fractal();
		b = new Fractal();

		a.numer = 1;
		a.denom = 2;

		b.numer = 1;
		b.denom = 3;

		c = a.add(b);

		d = a.mul(b);
		System.out.println("add \n" + c.numer);
		System.out.println(c.denom);

		System.out.println();
		System.out.println("mul \n" + d.numer);
		System.out.println(d.denom);

	}
}
