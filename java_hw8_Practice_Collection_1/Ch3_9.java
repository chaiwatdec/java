package java_hw8_Practice_Collection_1;

import java.util.Scanner;

public class Ch3_9
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int r = sc.nextInt();

		int choice = sc.nextInt();

		if (choice == 1)
		{
			long p = permutation(n, r);
			System.out.println(p);
		} else
		{
			long c = combination(n, r);
			System.out.println(c);
		}

		sc.close();
	}

	public static long permutation(int n, int r)
	{
		return factorial(n) / factorial(n - r);
	}

	public static long combination(int n, int r)
	{
		return factorial(n) / (factorial(r) * factorial(n - r));
	}

	public static long factorial(int f)
	{
		long result = 1;

		for (int i = 2; i <= f; i++)
		{
			result = result * i;
		}

		return result;
	}
}
