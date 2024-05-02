package java_day4;

public class d4_18
{

	public static void main(String[] args)
	{

		double sum = 0, n = 50000;
		int i = 1;

		while (i <= n)
		{

			sum += 1.0 / i;

			i++;
		}

		System.out.println(sum);

	}

}
