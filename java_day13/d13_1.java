package java_day13;

public class d13_1
{
	public static void main(String[] args)
	{
		for (int i = 0; i <= 10; i++)
		{
			for (int j = 0; j < 10 - i; j++)
			{
				System.out.print("-");
			}

			for (int j = 0; j <= i; j++)
			{
				System.out.print("x");
			}
			System.out.println();
		}

	}
}
