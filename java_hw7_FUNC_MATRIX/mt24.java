package java_hw7_FUNC_MATRIX;

import java.util.Scanner;

public class mt24
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		Matrix2 m1 = new Matrix2();
		m1.E11 = sc.nextDouble();
		m1.E12 = sc.nextDouble();
		m1.E21 = sc.nextDouble();
		m1.E22 = sc.nextDouble();
		
		double result = m1.det();
		
		System.out.println(result);

		sc.close();
	}
}
