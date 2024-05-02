package java_hw_super_extra_3;

import java.util.Arrays;

public class EC_8
{
	public static void main(String[] args)
	{
		// convolution
		int a[] = new int[]
		{ 1, 2, 1, 3, 8, 5, 4, 6, 8, 4, 2, 5, 6, 1, 2, 1, 0, 0, 1, 0 };
		int b[] = new int[]
		{ -1, 0, 1 };

		int c[] = new int[a.length - 2];

		int i, j, sum;
		for (i = 0; i < a.length - 2; i++)
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
