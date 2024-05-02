package java_hw7_FUNC_MATRIX;

import java.util.Scanner;

public class mt33
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		Matrix3 v1 = new Matrix3();
		Matrix3 v2 = new Matrix3();

		v1.E = new double[3][3];
		v2.E = new double[3][3];

		for (int i = 0; i < v1.E.length; i++)
		{
			for (int j = 0; j < v1.E[0].length; j++)
			{
				v1.E[i][j] = sc.nextDouble();
			}
		}

		for (int i = 0; i < v2.E.length; i++)
		{
			for (int j = 0; j < v2.E[0].length; j++)
			{
				v2.E[i][j] = sc.nextDouble();
			}
		}

		Matrix3 result = v1.mul(v2);

		for (int i = 0; i < v1.E.length; i++)
		{
			for (int j = 0; j < v1.E[0].length; j++)
			{
				System.out.println(result.E[i][j]);
			}
		}

		sc.close();
	}
}
