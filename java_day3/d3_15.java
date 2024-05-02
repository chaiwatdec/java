package java_day3;

import java.util.Scanner;

public class d3_15
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a;
		a = sc.nextInt();

		int k = 1;
		int count = 1;

		while (k < a)
		{
			if (a % k == 0)
			{
				count++;
			} else
			{

			}

			k++;
		}

		if (count == 2)
		{
			System.out.println(a + " is a prime (T)");
		} else
		{
			System.out.println(a + " is not a prime (F)");
		}
		sc.close();
	}

}
