package java_day4;

import java.util.Scanner;

public class d4_22
{

	public static void main(String[] args)
	{
		int a, b, c, m, n;

		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		m = b - a - 1;
		n = c - b - 1;
		m = m > n ? m : n;

		/*
		 * if (m>n) { m=m; } else { m=n; }
		 */

		System.out.println(m);
		
		sc.close();
	}

}
