package java_hw_super_extra_3;

import java.util.Scanner;

public class EC_3
{

	public static void main(String[] args)
	{
		int max_value = Integer.MIN_VALUE;
		int max_index = 0;
		int[] x = new int[10];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < x.length; i++)
		{
			x[i] = sc.nextInt();
		}

		for (int i = 0; i < x.length; i++)
		{
			if (x[i] > max_value)
			{
				max_value = x[i];
				max_index = i;
			}
		}

		System.out.println(max_value);
		System.out.println(max_index);
		sc.close();
	}

}
