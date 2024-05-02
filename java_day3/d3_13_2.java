package java_day3;

import java.util.Scanner;

public class d3_13_2
{

	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();

		int k = a;

		while (true)
		{
			if (k % a == 0 && k % b == 0)
			{
				break;
			}

			k++;

			sc.close();
		}
		System.out.println(k);
	}
}
