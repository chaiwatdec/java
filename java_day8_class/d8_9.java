package java_day8_class;

import java.util.Scanner;

public class d8_9
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		char x[][] = new char[][]
		{
				{ 'a', 'b', 'c', 'd' },
				{ 'e', 'f', 'g', 'h' },
				{ 'i', 'j', 'k', 'l' },
				{ 'm', 'n', 'o', 'p' } };

		print(x);

		while (true)
		{
			System.out.print("\nenter (1:4) ");
			int n = sc.nextInt();
			n = n - 1;
			// System.out.println(n);

			if (n == -1)
			{
				break;
			}

			System.out.print("enter (l,r,u,d): ");
			char c = sc.next().charAt(0);
			// System.out.println(c);
			System.out.println();

			if (n == -1)
			{
				break;
			}

			if (c == 'l')
			{
				char t = x[n][0];
				for (int i = 0; i < x[0].length - 1; i++)
				{
					x[n][i] = x[n][i + 1];
				}
				x[n][x[0].length - 1] = t;
			} else if (c == 'r')
			{
				char t = x[n][x[0].length - 1];
				for (int i = x[0].length - 1; i > 0; i--)
				{
					x[n][i] = x[n][i - 1];
				}
				x[n][0] = t;
			} else if (c == 'd')
			{
				char t = x[x[0].length - 1][n];
				for (int i = x.length - 1; i > 0; i--)
				{
					x[i][n] = x[i - 1][n];

				}
				x[0][n] = t;
			} else if (c == 'u')
			{
				char t = x[0][n];
				for (int i = 0; i < x.length - 1; i++)
				{
					x[i][n] = x[i + 1][n];
				}
				x[x.length - 1][n] = t;
			}

			print(x);
		}

		sc.close();
	}

	public static void print(char[][] x)
	{
		for (int i = 0; i < x.length; i++)
		{
			for (int j = 0; j < x[0].length; j++)
			{
				System.out.print(x[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
