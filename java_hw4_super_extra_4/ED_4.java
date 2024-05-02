package java_hw_super_extra_4;

import java.util.Scanner;

public class ED_4
{
	public static void main(String[] args)
	{
		int a[] = new int[3];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}

		long max = Integer.MIN_VALUE;

		for (int i = 0; i < a.length; i++)
		{
			if (max < a[i])
				max = a[i];
		}
		System.out.println(max);

		sc.close();
	}
}
