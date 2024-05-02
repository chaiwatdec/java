package java_day11;

import java.util.Scanner;

public class d11_4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s1;

		s1 = sc.nextLine();
		s1 = s1.toLowerCase().replaceAll(" ", ""); // delete space and make to lowercase

		boolean isPalin = true;

		for (int i = 0; i < s1.length() / 2; i++)
		{
			if (s1.charAt(i) == s1.charAt(s1.length() - 1 - i))
			{
				isPalin = true;
			} else
			{
				isPalin = false;
				break;
			}
		}

		System.out.println("isPalin: " + isPalin);
		sc.close();
	}
}
