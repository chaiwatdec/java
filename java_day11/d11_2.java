package java_day11;

import java.util.Scanner;

public class d11_2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s1, s2;
		s1 = sc.nextLine();
		s2 = sc.nextLine();

		if (s1.indexOf(s2) == -1)
		{
			System.out.println("None");
			sc.close();
			return;
		}

		int i = 0;
		while (i > 0 && i < s1.length())
		{
			i = s1.indexOf(s2, i);
			if (i == -1)
				break;
			System.out.println(i);
			i++;

			sc.close();
		}
	}
}
