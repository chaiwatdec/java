package java_hw_super_extra_4;

import java.util.Scanner;

public class ED_12
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();

		int temp[] = new int[a.length()];
		for (int i = 0; i < temp.length; i++)
		{
			temp[i] = Integer.parseInt("" + a.charAt(i));
		}

		String s[][] = new String[][]
		{
				{ "xxxx", "x--x", "x--x", "x--x", "xxxx" },
				{ "---x", "---x", "---x", "---x", "---x" },
				{ "xxxx", "---x", "xxxx", "x---", "xxxx" },
				{ "xxxx", "---x", "xxxx", "---x", "xxxx" },
				{ "x--x", "x--x", "xxxx", "---x", "---x" },
				{ "xxxx", "x---", "xxxx", "---x", "xxxx" },
				{ "x---", "x---", "xxxx", "x--x", "xxxx" },
				{ "xxxx", "---x", "---x", "---x", "---x" },
				{ "xxxx", "x--x", "xxxx", "x--x", "xxxx" },
				{ "xxxx", "x--x", "xxxx", "---x", "---x" } };

		for (int i = 0; i < s[0].length; i++)
		{
			for (int j = 0; j < a.length(); j++)
			{
				if (j == a.length() - 1)
				{
					System.out.print(s[temp[j]][i]);
				} else
				{
					System.out.print(s[temp[j]][i] + "\t");
				}
			}
			System.out.println();

		}
		sc.close();
	}
}
