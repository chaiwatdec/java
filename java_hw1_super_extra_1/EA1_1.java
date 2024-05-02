package java_hw_super_extra_1;

import java.util.Scanner;

public class EA1_1
{

	public static void main(String[] args)
	{
		double f, m1, m2, R, G = (6.67 * 10e-12);

		Scanner sc = new Scanner(System.in);
		m1 = sc.nextDouble();
		m2 = sc.nextDouble();
		R = sc.nextDouble();

		f = (G * m1 * m2) / (R * R);

		System.out.println(f);

		sc.close();
	}

}
