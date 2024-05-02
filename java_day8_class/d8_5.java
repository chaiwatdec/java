package java_day8_class;

import java.util.Scanner;

public class d8_5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println(largestPower2(x));
		sc.close();
	}

	public static int largestPower2(int n)
	{
		int a = 1;
		while (a * 2 < n)
		{
			a = a * 2;
		}

		if (a * 2 == n)
		{
			return n;
		}

		return a;
	}

}
