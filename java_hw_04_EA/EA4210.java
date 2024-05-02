package java_hw_04_EA;

import java.util.Scanner;

public class EA4210
{

	public static void main(String[] args)
	{
		int a, b, c;

		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		if (c == 1)
		{
			System.out.println(a + b);
		} else if (c == 2)
		{
			System.out.println(a - b);
		} else if (c == 3)
		{
			System.out.println(a * b);
		} else if (c == 4)
		{
			System.out.println(a / b);
		} else
		{
		}

		sc.close();

	}

}
