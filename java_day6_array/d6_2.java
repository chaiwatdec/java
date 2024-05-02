package java_day6_array;

import java.util.Scanner;

public class d6_2
{
	public static void main(String[] args)
	{
		int x[] = new int[10];
		int count = 0, v;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < x.length; i++)
		{
			System.out.print("Enter Array index " + i + " : ");
			x[i] = sc.nextInt();
		}

		System.out.println("\nEnter V: ");
		v = sc.nextInt();

		for (int i = 0; i < x.length; i++)
		{
			if (x[i] == v)
			{
				count++;
				break;
			}
		}

		if (count == 0)
		{
			System.out.println(v + " is not in Array");
		} else
		{
			System.out.println(v + " is in Array");
		}

		sc.close();
	}
}
