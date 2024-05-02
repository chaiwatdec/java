package java_hw7_FUNC_MATRIX;

import java.util.Scanner;

public class mt26
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		Matrix2 m1 = new Matrix2();
		m1.E11 = sc.nextDouble();
		m1.E12 = sc.nextDouble();
		m1.E21 = sc.nextDouble();
		m1.E22 = sc.nextDouble();

		int row = sc.nextInt();
		int column = sc.nextInt();

		double result = m1.cof(row, column);

		System.out.println(result);

		sc.close();
	}
}
