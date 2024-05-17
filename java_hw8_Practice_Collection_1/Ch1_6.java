package java_hw8_Practice_Collection_1;

import java.util.Scanner;

public class Ch1_6
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		// input format 0, 1, -2, -3, 2, 3, -1, 0
		String input = sc.nextLine();

		// split to array
		String[] toNumbers = input.split(",");

		int[] numbers = new int[toNumbers.length];

		// trim space and convert to array
		for (int i = 0; i < toNumbers.length; i++)
		{
			numbers[i] = Integer.parseInt(toNumbers[i].trim());
		}

		int count = 0;

		for (int i = 0; i < numbers.length; i++)
		{
			if (i == 0)
			{
				if (numbers[i] < 0)
				{
					count++;
				}
			} else if (numbers[i] < 0)
			{
				if (numbers[i - 1] < 0)
				{

				} else
				{
					count++;
				}

			}
		}
		System.out.println(count);
		sc.close();
	}
}
