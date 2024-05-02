package java_day5;

import java.util.Scanner;

public class d5_11
{
	public static void main(String[] args)
	{
		int[] x = new int[10];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < x.length; i++)
		{
			x[i] = sc.nextInt();
		}

		int fac = 1;
		for (int i = 0; i < x.length; i++)
		{
			fac = fac * x[i];
		}
		System.out.println(fac);
		sc.close();
	}
}
