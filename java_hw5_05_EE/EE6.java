package java_hw5_05_EE;

public class EE6
{
	public static void main(String[] args)
	{
		double n = 2000000, dif;

		while (true)
		{

			dif = pi(n - 1) - pi(n);
			// System.out.println(pi(n));
			// System.out.println(pi(n-1));
			// System.out.println(dif);

			if (Math.abs(dif) < 1.000E-6)
			{
				System.out.println("yes " + n);
				break;
			} else
			{

			}
			n++;
		}

	}

	public static double pi(double n)
	{
		double sum = 0, total = 0;

		for (double i = 1; i <= n; i++)
		{
			if (i % 2 == 0)
			{
				sum -= 1 / ((2 * i) - 1);
			} else
			{
				sum += 1 / ((2 * i) - 1);
			}
		}

		total = 4 * sum;
		return total;
	}
}
