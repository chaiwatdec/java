package java_hw8_Practice_Collection_1;

import java.util.Scanner;

public class Ch9_2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();

		String input = sc.nextLine();

		String[] toNumbers = input.split(" ");

		int[] x = new int[toNumbers.length];

		// trim space and convert to array
		for (int i = 0; i < toNumbers.length; i++)
		{
			x[i] = Integer.parseInt(toNumbers[i].trim());
		}

		System.out.println(isSorted(x));

		sc.close();
	}

	public static boolean isSorted(int[] x)
	{
		boolean ascending = true;

		for (int i = 0; i < x.length - 1; i++)
			if (x[i] > x[i + 1])
			{
				ascending = false;
			}

		for (int i = 0; i < x.length - 1; i++)
		{
			if (ascending)
			{
				if (x[i] > x[i + 1])
				{
					return false;
				}
			} else
			{
				if (x[i] < x[i + 1])
				{
					return false;
				}
			}
		}

		return true;
	}
}
