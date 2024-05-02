package java_day6_array;

import java.util.Scanner;

public class d6_3
{
	public static void main(String[] args)
	{
		int x[] = new int[10];
		int max = Integer.MIN_VALUE;
		int max_index = 0;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < x.length; i++)
		{
			x[i] = sc.nextInt();
		}

		for (int i = 0; i < x.length; i++)
		{
			if (x[i] > max)
			{
				max = x[i];
				max_index = i;
			}
		}

		System.out.println("max = " + max + ", index:" + max_index);
		sc.close();
	}
}
