package java_hw8_Practice_Collection_1;

import java.util.Arrays;
import java.util.Scanner;

public class Ch3_7
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();

		String[] toNumbers = input.split(" ");

		int[] numbers = new int[toNumbers.length];

		for (int i = 0; i < toNumbers.length; i++)
		{
			// numbers[i] = Integer.parseInt(toNumbers[i].trim());
			numbers[i] = Integer.parseInt(toNumbers[i].trim());
		}

		System.out.println(Arrays.toString(numbers));

		int sum = sc.nextInt();

		int result = 0;
		for (int i = 0; i < numbers.length - 1; i++)
		{
			if (numbers[i] + numbers[i + 1] == sum)
			{
				result = i + 1;
				// System.out.println(i);
			}
		}

		System.out.println(result);

		sc.close();
	}
}
