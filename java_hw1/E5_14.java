package java_homework;

import java.util.Scanner;

public class E5_14
{

	public static void main(String[] args)
	{
		double a, b, c, d, f;
		double avg;

		Scanner sc = new Scanner(System.in);

		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		d = sc.nextDouble();

		f = sc.nextInt();

		avg = ((4 * a) + (3 * b) + (2 * c) + d) / (a + b + c + d + f);
		
		System.out.println(avg);

		sc.close();
	}

}
