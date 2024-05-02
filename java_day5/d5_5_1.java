package java_day5;

public class d5_5_1
{
	public static void main(String[] args)
	{
		int n = 100;
		for (int i = 2; i <= 100; i++)
		{
			int count = 0;

			for (int j = 1; j <= n; j++)
			{
				if (i % j == 0)
				{
					count++;
				}
			}
			if (count == 2)
			{
				System.out.println(i);
			}
		}
	}
}
