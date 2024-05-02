package java_day5;

public class d5_3
{

	public static void main(String[] args)
	{
		int j = 1;

		while (j < 10)
		{
			int i = 1;
			while (i <= 9 - j) // count back
			{

				System.out.print("-");
				i++;
			}

			i = 0;
			while (i <= j)
			{
				System.out.print(i);
				i++;
			}

			i = i - 2;
			while (i >= 0)
			{
				System.out.print(i);
				i--;
			}
			System.out.println();
			j++;
		}
	}

}
