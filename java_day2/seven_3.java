package java_day2;

public class seven_3
{

	public static void main(String[] args)
	{

		int n = 6;

		for (int j = 1; j <= n; j++)
		{
			for (int i = 1; i <= n; i++)
			{
				if (i == j || i == n - j + 1)
				{
					System.out.print("x");
				} else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}

}
