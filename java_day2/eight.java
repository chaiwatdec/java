package java_day2;

public class eight
{

	public static void main(String[] args)
	{
		int n = 5;
		for (int j = 1; j <= n; j++)
		{
			for (int i = 1; i <= n * 2; i++)
			{
				if (i > j)
				{
					System.out.print("X");
				} else
				{
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}

}
