package java_hw7_FUNC_MATRIX;

import java.util.Scanner;

public class mt35
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		Matrix3 v1 = new Matrix3();
		v1.E = new double[3][3];

		for (int i = 0; i < v1.E.length; i++)
		{
			for (int j = 0; j < v1.E[0].length; j++)
			{
				v1.E[i][j] = sc.nextDouble();
			}
		}

		int row = sc.nextInt();
		int col = sc.nextInt();

		double result = v1.minor(row, col);

		System.out.println(result);

		sc.close();
	}
}
