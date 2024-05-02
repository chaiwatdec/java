package java_hw6_06_EF;

import java.util.Scanner;

public class EF7
{
	public static void main(String[] args)
	{
		// isbn10 calculate checkdigit
		Scanner sc = new Scanner(System.in);
		String isbn10nc = sc.nextLine();

		int sum = 0;
		for (int i = 0; i < isbn10nc.length(); i++)
		{
			int digit = Character.getNumericValue(isbn10nc.charAt(i));
			sum = sum + (digit * (i + 1));
		}

		int checkdigit = sum % 11;

		if (checkdigit == 10)
		{
			checkdigit = 'X';
		}

		System.out.println(isbn10nc + "" + checkdigit);

		sc.close();
	}
}
