package java_hw_super_extra_3;

import java.util.Arrays;
import java.util.Scanner;

public class EC_8_2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int aa;
		// amount array a
		aa = sc.nextInt();
		int a[] = new int[aa];

		// value array a
		for (int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}

		// amount array b
		int ab;
		ab = sc.nextInt();
		int b[] = new int[ab];

		// value array b
		for (int i = 0; i < b.length; i++)
		{
			b[i] = sc.nextInt();
		}

		int c[] = new int[aa - ab + 1];

		int i, j, sum;

		// convolute
		for (i = 0; i < aa - ab + 1; i++)
		{
			sum = 0;
			for (j = 0; j < b.length; j++)
			{
				sum = sum + (b[j] * a[i + j]);
			}
			c[i] = sum;
		}

		System.out.println(Arrays.toString(c));
	}
}
