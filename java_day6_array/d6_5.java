package java_day6_array;

import java.util.Arrays;
import java.util.Scanner;

public class d6_5
{

	public static void main(String[] args)
	{
		// insert v in array
		int x[] = new int[10];
		int index, v;

		Scanner sc = new Scanner(System.in);

		// input to array
		for (int i = 0; i < x.length; i++)
		{
			x[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(x));

		System.out.println("\nEnter V: ");
		v = sc.nextInt();
		System.out.println("Enter index: ");
		index = sc.nextInt();

		for (int i = x.length - 1; i > index; i--)
		{
			x[i] = x[i - 1];
		}

		x[index] = v;

		System.out.println("\n" + Arrays.toString(x));
		sc.close();

	}
}
