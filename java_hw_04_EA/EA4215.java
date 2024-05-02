package java_hw_04_EA;

import java.util.Scanner;

public class EA4215
{

	public static void main(String[] args)
	{
		int a, b, c;

		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		if ((a + b) == c)
		{
			System.out.println("+");
		} else if ((a - b) == c)
		{
			System.out.println("-");
		} else if ((a * b) == c)
		{
			System.out.println("*");
		} else if ((a / b) == c)
		{
			System.out.println("/");
		}
		sc.close();
	}

}
