package java_hw6_06_EF;

import java.util.Scanner;

public class EF6
{
	public static void main(String[] args)
	{
		// convert isbn10 to isbn13
		Scanner sc = new Scanner(System.in);
		String isbn10c = sc.nextLine();
		String isbn13nc = "978" + isbn10c;

		int sum = 0;
		for (int i = 0; i < isbn13nc.length() - 1; i++)
		{
			int digit = Character.getNumericValue(isbn13nc.charAt(i));
			if (i % 2 == 0)
			{
				sum = sum + digit;
			} else
			{
				sum = sum + (digit * 3);
			}
		}

		int checkdigit;
		checkdigit = 10 - (sum % 10);

		if (checkdigit == 10)
		{
			checkdigit = 0;
		}

		System.out.println(isbn13nc.substring(0, isbn13nc.length() - 1) + checkdigit);
		sc.close();
	}
}
