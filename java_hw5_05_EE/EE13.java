package java_hw5_05_EE;

import java.util.Scanner;

public class EE13
{
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		double x[][] = new double[n][5];

		for (int i = 0; i < x.length; i++)
		{
			for (int j = 0; j < x[0].length; j++)
			{
				x[i][j] = sc.nextDouble();
				// System.out.print(x[i][j] + "\t");
			}
		}

		for (int i = 0; i < x.length; i++)
		{
			double sum = 0;
			for (int j = 0; j < x[0].length; j++)
			{
				sum = sum + x[i][j];
			}
			System.out.println(sum / x[0].length);
		}

		for (int i = 0; i < x[0].length; i++)
		{
			double sumx = 0;
			for (int j = 0; j < x.length; j++)
			{
				sumx = sumx + x[j][i];
			}
			System.out.println(sumx / x.length);
		}
		
		sc.close();
	}
}
