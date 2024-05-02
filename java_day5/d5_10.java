package java_day5;

import java.util.Scanner;

public class d5_10
{
	public static void main(String[] args)
	{
		int count = 0;
		int[] x = new int[10];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < x.length; i++)
		{
			x[i] = sc.nextInt();

			if (x[i] % 2 == 0)
			{
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}

}
