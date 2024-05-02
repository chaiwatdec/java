package java_day4;

public class d4_19
{

	public static void main(String[] args)
	{

		double sum = 0, n = 5000;

		double k;

		int i = 1;

		while (i <= n)
		{
			k = (2 * i) - 1;

			if (i % 2 == 0)
			{
				sum = sum - (1 / k);		
			} else
			{
				sum = sum + (1 / k);
			}

			i++;
		}

		System.out.println(4 * sum);

	}

}
