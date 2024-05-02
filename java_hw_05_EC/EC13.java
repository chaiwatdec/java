package java_hw_05_EC;

import java.util.Scanner;

public class EC13
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int number;
		number = sc.nextInt();
		String numberstr = Integer.toString(number);
		StringBuilder result = new StringBuilder();
		int length = numberstr.length();

		for (int i = 0; i < length; i++)
		{
			if (i != 0 && (length - i) % 3 == 0)
			{
				result.append(",");
			}
			result.append(numberstr.charAt(i));
		}

		System.out.println(result);
		sc.close();
	}

}
