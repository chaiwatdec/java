package java_day6_array;

import java.util.Scanner;

public class d6_1
{
	public static void main(String[] args)
	{
		int x[] = new int[10];
		int count = 0;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < x.length; i++)
		{
			x[i] = sc.nextInt();

			if (x[i] >= 10)
			{
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}

}
