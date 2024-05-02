package java_day5;

public class d5_1
{

	public static void main(String[] args)
	{
		int j = 1;

		while (j <= 10)
		{
			int i = 1;
			while (i <= 10 - j) // count back
			{

				System.out.print("-");
				i++;
			}

			i = 1;
			while (i <= j)
			{
				System.out.print("x");
				i++;
			}
			System.out.println();
			j++;
		}
	}
}
