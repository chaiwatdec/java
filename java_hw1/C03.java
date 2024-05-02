package java_homework;

public class C03
{
	public static void main(String[] args)
	{
		int n = 10;
		for (int j = 1; j <= n; j++)
		{
			for (int i = 1; i <= n ; i++)
			{
				if (i < j)
				{
					System.out.print("-");
				} else
				{
					System.out.print("x");
				}
			}
			System.out.println();
		}
	}
}
