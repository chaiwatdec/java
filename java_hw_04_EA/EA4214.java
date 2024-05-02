package java_hw_04_EA;

import java.util.Scanner;

public class EA4214
{

	public static void main(String[] args)
	{

		int a, b, c, max, x, y;

		Scanner sc = new Scanner(System.in);

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		if (a >= b && b >= c)
		{
			max = a;
			x = b;
			y = c;
		} else if (b >= c && b >= a)
		{
			max = b;
			x = a;
			y = c;
		} else
		{
			max = c;
			x = a;
			y = b;
		}

		if (x + y <= max)
		{
			System.out.println("not triangle");
		} else
		{
			System.out.println("triangle");
		}

		sc.close();
	}

}
