package java_day6_array;

import java.util.Arrays;
import java.util.Scanner;

public class d6_7
{

	public static void main(String[] args)
	{
		// a extend b
		int a[] = new int[10];
		int b[] = new int[10];
		int c[] = new int[a.length + b.length];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < a.length; i++)
		{
			System.out.print("Enter a index" + i + " : ");
			a[i] = sc.nextInt();
		}
		System.out.println("\n" + Arrays.toString(a) + "\n");

		for (int i = 0; i < b.length; i++)
		{
			System.out.print("Enter b index" + i + " : ");
			b[i] = sc.nextInt();
		}
		System.out.println("\n" + Arrays.toString(b) + "\n");

		for (int i = 0; i < a.length; i++)
		{
			c[i] = a[i];
		}

		for (int i = 0; i < b.length; i++)
		{
			c[i + a.length] = b[i];
		}

		System.out.println("a extend by b :");
		System.out.println(Arrays.toString(c));
		sc.close();
	}

}
