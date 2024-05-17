package java_hw8_Practice_Collection_1;

import java.util.Scanner;

public class Ch2_1
{
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();

		String[] toNumbers = input.split(" ");

		int[] numbers = new int[toNumbers.length];

		for (int i = 0; i < toNumbers.length; i++)
		{
			numbers[i] = Integer.parseInt(toNumbers[i].trim());
		}

		int max = Integer.MIN_VALUE;

		for (int i = 0; i < numbers.length; i++)
		{
			if (numbers[i] > max)
			{
				max = numbers[i];
			}
		}

		System.out.println(max);
		
		sc.close();
	}
}
