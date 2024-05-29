package java_hw8_Practice_Collection_1;

import java.util.Arrays;
import java.util.Scanner;

public class Ch4_1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();

		String[] s = new String[n];

		for (int i = 0; i < n; i++)
		{
			s[i] = sc.nextLine();
		}

		System.out.println(Arrays.toString(s));

		int count = 0;

		// Sort by first characters
		for (int i = 0; i < n - 1; i++)
		{
			for (int j = 0; j < n - i - 1; j++)
			{
				if (s[j].charAt(0) > s[j + 1].charAt(0))
				{
					String temp = s[j];
					s[j] = s[j + 1];
					s[j + 1] = temp;
					count++;
				}
			}
			// count++;
		}

		// Sort by amount characters
		for (int i = 0; i < n - 1; i++)
		{
			for (int j = 0; j < n - i - 1; j++)
			{
				if (s[j].length() > s[j + 1].length())
				{
					String temp2 = s[j];
					s[j] = s[j + 1];
					s[j + 1] = temp2;
					count++;
				}
			}
			// count++;
		}

		System.out.println(Arrays.toString(s));
		System.out.println(count);
		
		sc.close();
	}
}
