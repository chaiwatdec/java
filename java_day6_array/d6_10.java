package java_day6_array;

import java.util.Arrays;
import java.util.Scanner;

public class d6_10
{
	public static void main(String[] args)
	{
		int aa = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter amount of index array: ");
		aa = sc.nextInt();

		int a[] = new int[aa];
		int b[] = new int[aa % 2 == 0 ? aa / 2 : aa / 2 + 1];

		for (int i = 0; i < aa; i++)
		{
			System.out.print("Enter value in index " + i + ": ");
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < b.length; i++)
		{
			b[i] = a[i] + a[aa - 1 - i];
		}

		System.out.println(Arrays.toString(b));
		sc.close();
	}
}
