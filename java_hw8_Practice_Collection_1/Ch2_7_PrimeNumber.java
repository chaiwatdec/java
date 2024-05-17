package java_hw8_Practice_Collection_1;

import java.util.Scanner;

public class Ch2_7_PrimeNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();

		if (isPrime(number) == true)
		{
			System.out.println("Yes");
		} else
		{
			System.out.println("NO");
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
