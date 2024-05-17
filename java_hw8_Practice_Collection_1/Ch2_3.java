package java_hw8_Practice_Collection_1;

import java.util.Scanner;

public class Ch2_3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();

		int capitalCount = 0;

		for (int i = 0; i < input.length(); i++)
		{
			char ch = input.charAt(i);
			if (Character.isUpperCase(ch))
			{
				capitalCount++;
			}
		}

		System.out.println(capitalCount);
		sc.close();

	}
}
