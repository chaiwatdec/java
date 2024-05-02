package java_hw_04_EA;

import java.util.Scanner;

public class EA4216
{

	public static void main(String[] args)
	{
		int a, b, c;

		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		if (a == b && b == c)
		{
			System.out.println("a = b = c");
		} else if (a == b)
		{
			System.out.println("a = b");
		} else if (b == c)
		{
			System.out.println("b = c");
		} else if (a == c)
		{
			System.out.println("a = c");
		} else if (a != b && b != c)
		{
			System.out.println("a != b != c");
		}
		sc.close();
	}

}
