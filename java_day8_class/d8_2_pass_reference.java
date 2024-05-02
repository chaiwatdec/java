package java_day8_class;

import java.util.Scanner;

public class d8_2_pass_reference
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 number: ");
		int x, y;
		x = sc.nextInt();
		y = sc.nextInt();
		int z[] = new int[1];
		sum(x, y, z);
		System.out.println(z[0]);

		sc.close();
	}

	public static void sum(int a, int b, int c[]) // pass by reference: array, obj
	{
		c[0] = a + b;
	}
}
