package java_hw_super_extra_1;

import java.util.Scanner;

public class EA4
{

	public static void main(String[] args)
	{
		double R, A, l, p = 1.59 * 10e-9;

		Scanner sc = new Scanner(System.in);
		A = sc.nextDouble();
		l = sc.nextDouble();
		
		R = p * (l / A);

		System.out.println(R);
		sc.close();
	}

}
