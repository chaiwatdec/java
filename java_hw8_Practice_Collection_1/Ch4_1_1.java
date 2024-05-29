package java_hw8_Practice_Collection_1;

import java.util.Scanner;

public class Ch4_1_1
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

		for (int i = 0; i < n; i++)
		{
			int chCount = countCharacters(s[i]);
			System.out.println(chCount);
		}
		
		sc.close();
	}


	public static int countCharacters(String s) {
        return s.length();
    }
}
