package java_day6_array;

import java.util.Arrays;
import java.util.Scanner;

public class d6_6
{

	public static void main(String[] args)
	{
		// sort by selection sort
		int x[] = new int[10];
		Scanner sc = new Scanner(System.in);

		// input to array
		for (int i = 0; i < x.length; i++)
		{
			x[i] = sc.nextInt();
		}
		System.out.println("\n" + Arrays.toString(x));

		for (int j = 0; j < x.length; j++)
		{
			int min = Integer.MAX_VALUE;
			int min_index = -1;
			for (int i = 0; i < x.length - j; i++)
			{
				if (x[i] < min)
				{
					min = x[i];
					min_index = i;
				}
			}

			int swap;
			swap = x[x.length - j - 1];
			x[x.length - j - 1] = x[min_index];
			x[min_index] = swap;
		}

		System.out.println(Arrays.toString(x));
		sc.close();
	}
}
