package java_hw8_Practice_Collection_1;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Ch3_4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();

		Set<Character> foundDigits = new HashSet<>();

		// Loop through each character in the input string
		for (int i = 0; i < input.length(); i++)
		{
			char ch = input.charAt(i);
			if (Character.isDigit(ch))
			{
				foundDigits.add(ch);
			}
		}

		StringBuilder missingDigits = new StringBuilder();

		for (char digit = '0'; digit <= '9'; digit++)
		{
			if (!foundDigits.contains(digit))
			{
				if (missingDigits.length() > 0)
				{
					missingDigits.append(" ");
				}
				missingDigits.append(digit);
			}
		}

		if (missingDigits.length() == 0)
		{
			System.out.println("No missing digits");
		} else
		{
			System.out.println(missingDigits);
		}

		sc.close();
	}
}
