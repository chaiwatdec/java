package java_homework;

import java.util.Scanner;

public class E5_11
{

	public static void main(String[] args)
	{
		double a1, a2, b1, b2, c1, c2, x, y;

		Scanner sc = new Scanner(System.in);

		a1 = sc.nextInt();
		b1 = sc.nextInt();
		c1 = sc.nextInt();
		a2 = sc.nextInt();
		b2 = sc.nextInt();
		c2 = sc.nextInt();

		x = ((b2*c1)-(c2*b1))/((a1*b2)-(a2*b1));
				
		y = (c1 - a1 * x) / b1;
		
		System.out.println(x);
		System.out.println(y);

		sc.close();

	}

}
