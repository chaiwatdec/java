package java_hw8_Practice_Collection_1;

import java.util.Scanner;

public class Ch4_2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();

		// convert to lowercase
		s = s.toLowerCase();

		int vowelCount = 0;
		int consonantCount = 0;

		for (int i = 0; i < s.length(); i++)
		{
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			{
				vowelCount++;
			}
		}

		for (int i = 0; i < s.length(); i++)
		{
			char ch = s.charAt(i);
			if (isConsonant(ch))
			{
				consonantCount++;
			}
		}

		System.out.print(vowelCount+" ");
		System.out.println(consonantCount);

		sc.close();
	}

	public static boolean isConsonant(char ch)
	{
		return !(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') && Character.isLetter(ch);
	}

}
