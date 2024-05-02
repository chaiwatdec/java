package java_day8_class;

import java.util.Scanner;

public class d8_6
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = isPrime(x);

		if (y == 1)
		{
			System.out.println("yes");
		} else if (y == 0)
		{
			System.out.println("no");
		}

		sc.close();
	}

	public static int isPrime(int x)
	{
		int count = 0;

		for (int j = 1; j <= x; j++)
		{
			if (x % j == 0)
			{
				count++;
			}
		}

		if (count == 2)
		{
			return 1;
		}
		
		return 0;
	}
}
