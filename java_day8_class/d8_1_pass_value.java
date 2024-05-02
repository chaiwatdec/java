package java_day8_class;

import java.util.Scanner;

public class d8_1_pass_value
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 number: ");
		int x, y, z;
		x = sc.nextInt();
		y = sc.nextInt();
		z = sum(x, y);
		System.out.println(z);

		sc.close();
	}

	public static int sum(int a, int b) // pass by value
	{
		int r;
		r = a + b;
		return r;
	}
}
