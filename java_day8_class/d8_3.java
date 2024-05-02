package java_day8_class;

import java.util.Scanner;

public class d8_3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 number: ");
		int w, x, y, z;
		w = sc.nextInt();
		x = sc.nextInt();
		y = sc.nextInt();
		// z = max(x, y);
		z = max3(w, x, y);
		System.out.println(z);

		sc.close();
	}

	public static int max(int a, int b)
	{
		// return a > b ? a : b; (same as below)
		if (a > b)
		{
			return a;
		} else
		{
			return b;
		}

	}

	public static int max3(int a, int b, int c)
	{
		int m;
		m = max(a, b);
		m = max(m, c);
		// m = max(max(a, b), c);
		return m;
	}

}
