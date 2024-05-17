package java_hw8_Practice_Collection_1;

import java.util.Scanner;

public class Ch2_5_2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();

		int countZero = 0;
		int countOne = 0;
		int countTwo = 0;
		int countThree = 0;
		int countFour = 0;
		int countFive = 0;
		int countSix = 0;
		int countSeven = 0;
		int countEight = 0;
		int countNine = 0;

		for (int i = 0; i < input.length(); i++)
		{
			char ch = input.charAt(i);
			if (ch == '0')
			{
				countZero++;
			} else if (ch == '1')
			{
				countOne++;
			} else if (ch == '2')
			{
				countTwo++;
			} else if (ch == '3')
			{
				countThree++;
			} else if (ch == '4')
			{
				countFour++;
			} else if (ch == '5')
			{
				countFive++;
			} else if (ch == '6')
			{
				countSix++;
			} else if (ch == '7')
			{
				countSeven++;
			} else if (ch == '8')
			{
				countEight++;
			} else if (ch == '9')
			{
				countNine++;
			}
		}

		System.out.println(countZero);
		System.out.println(countOne);
		System.out.println(countTwo);
		System.out.println(countThree);
		System.out.println(countFour);
		System.out.println(countFive);
		System.out.println(countSix);
		System.out.println(countSeven);
		System.out.println(countEight);
		System.out.println(countNine);

		sc.close();

	}
}
