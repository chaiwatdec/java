package java_hw7_FUNC_MATRIX;

import java.util.Scanner;

public class mt21
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		Matrix2 m1 = new Matrix2();
		m1.E11 = sc.nextDouble();
		m1.E12 = sc.nextDouble();
		m1.E21 = sc.nextDouble();
		m1.E22 = sc.nextDouble();
		
		Matrix2 m2 = new Matrix2();
		m2.E11 = sc.nextDouble();
		m2.E12 = sc.nextDouble();
		m2.E21 = sc.nextDouble();
		m2.E22 = sc.nextDouble();

		Matrix2 result = m1.add(m2);
		
		System.out.println(result.E11);
		System.out.println(result.E12);
		System.out.println(result.E21);
		System.out.println(result.E22);

		sc.close();
	}
}
