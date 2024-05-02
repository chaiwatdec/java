package java_hw_super_extra_4;

import java.util.Scanner;

public class ED_7
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = isPrime(x);

		System.out.println(y);
		sc.close();
	}

	public static int isPrime(int n)
	{
		int count = 0;

		for (int i = 1; i <= n; i++)
		{
			if (n % i == 0)
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
