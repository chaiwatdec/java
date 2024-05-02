package java_day7_rec_class;

public class d7_3_class_fractal
{
	public static void main(String[] args)
	{
		Fractal a = new Fractal();
		a.numerator = 1;
		a.denominator = 2;
		Fractal b = new Fractal();
		b.numerator = 1;
		b.denominator = 2;
		Fractal c = a.add(b);
		System.out.println(c.numerator + " / " + c.denominator);

		Fractal d = c.reduce();

		System.out.println(d.numerator);
		System.out.println(d.denominator);

		// System.out.println(Fractal.GCD(240, 16));
	}

}
