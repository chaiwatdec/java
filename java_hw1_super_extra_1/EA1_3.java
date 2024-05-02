package java_hw_super_extra_1;

import java.util.Scanner;

public class EA1_3
{

	public static void main(String[] args)
	{
		double f, m1, m2, R, G;

		Scanner sc = new Scanner(System.in);
		m1 = sc.nextDouble();
		m2 = sc.nextDouble();
		R = sc.nextDouble();
		f = sc.nextDouble();

		G = f * (R * R) / (m1 * m2);

		System.out.println(G);

		sc.close();

	}

}
