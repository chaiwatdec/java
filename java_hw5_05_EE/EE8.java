package java_hw5_05_EE;

import java.util.Scanner;

public class EE8
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();

		if (m >= n)
		{
			for (; m >= n; m--)
			{
				if (m == n)
				{
					System.out.print(m);
				} else
				{
					System.out.print(m + ",");
				}
			}
			
			sc.close();
		}
	}
}
