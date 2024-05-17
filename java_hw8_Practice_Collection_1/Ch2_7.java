package java_hw8_Practice_Collection_1;

import java.util.Scanner;

public class Ch2_7
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();

		if (isPrime(number) == true)
		{
			System.out.println("Prime Number");
		} else
		{

			for (int i = number - 1; i > 1; i--)
			{
				if (number % i == 0)
				{
					if (i == 2)
					{
						System.out.print(i);
					} else
					{
						System.out.print(i + " ");
					}
				}
			}
		}

		sc.close();
	}

	public static boolean isPrime(int num)
	{
		for (int i = 2; i <= Math.sqrt(num); i++)
		{
			if (num % i == 0)
			{
				return false;
			}
		}
		return true;
	}
}
