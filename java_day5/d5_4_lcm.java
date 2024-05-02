package java_day5;

import java.util.Scanner;

public class d5_4_lcm
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a, b, k;

		a = sc.nextInt();
		b = sc.nextInt();

		k = 1;

		while (true)
		{
			if (k % a == 0 && k % b == 0)
			{
				break;
			}
			k++;
		}
		System.out.println(k);
		sc.close();
	}
}
