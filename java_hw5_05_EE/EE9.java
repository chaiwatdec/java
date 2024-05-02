package java_hw5_05_EE;

import java.util.Scanner;

public class EE9
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();

		if (m >= n)
		{
			for (; n <= m; n++)
			{
				if (n == m)
				{
					System.out.print(n);
				} else
				{
					System.out.print(n + ",");
				}
			}

			sc.close();
		}
	}
}
