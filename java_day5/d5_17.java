package java_day5;

import java.util.Scanner;

public class d5_17
{

	public static void main(String[] args)
	{
		// matrix square
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		int c[][] = new int[3][3];
		int d[][] = new int[3][3];

		Scanner sc = new Scanner(System.in);

		//matrix a
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a[0].length; j++)
			{
				a[i][j] = sc.nextInt();
			}
		}

		//matrix b
		for (int i = 0; i < b.length; i++)
		{
			for (int j = 0; j < b[0].length; j++)
			{
				b[i][j] = sc.nextInt();
			}
		}

		//matrix plus c = a+b
		for (int i = 0; i < c.length; i++)
		{
			for (int j = 0; j < c[0].length; j++)
			{
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}
		
		//matrix multiply d = a*b
		for (int i = 0; i < d.length; i++)
		{
			for (int j = 0; j < d[0].length; j++)
			{
				d[i][j] = a[i][j] * b[i][j];
				System.out.print(d[i][j]+"\t");
			}
			System.out.println();
		}
		sc.close();
	}

}
