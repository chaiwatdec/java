package java_hw5_05_EE;

import java.util.Scanner;

public class EE15_1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int i, j;

		for (i = 0; i < n-1; i++)
		{
			for (j = 0; j <= n - i; j++)
			{
				/*if (j<=2) {
					System.out.print("");
				} else {
					System.out.print("\t");
				}*/
				System.out.print("\t");
			}
			for (j = 0; j <= i; j++)
			{
				if (j == i)
				{
					System.out.print(fac(i) / (fac(i - j) * fac(j)));
				} else
				{
					System.out.print(fac(i) / (fac(i - j) * fac(j)) + "\t\t");
				}
			}
			System.out.println();
		}
	}

	public static int fac(int n)
	{
		int fac = 1;

		if (n == 0)
		{
			return 1;
		} else
		{
			for (int i = 1; n > i; n--)
			{

				fac = fac * n;
			}
		}

		return fac;
	}
}
