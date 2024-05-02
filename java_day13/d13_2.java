package java_day13;

import java.util.Scanner;

public class d13_2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double v = 0;

		for (int i = 1; i <= n; i++)
		{
			v = v + Math.pow(n, i);
		}
		v = Math.sqrt(v);
		System.out.println(v);
		sc.close();
	}
}
