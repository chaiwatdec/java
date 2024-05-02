package java_day11;

import java.util.Scanner;

public class d11_3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s1, s2;
		int k;

		s1 = sc.nextLine();
		s2 = sc.nextLine();
		k = sc.nextInt();
		
		if (k < 0 || k > s1.length())
		{
			s1 = s1 + s2;
		} else
		{
			s1 = s1.substring(0, k) + s2 + s1.substring(k);
		}

		System.out.println(s1);
		sc.close();
	}
}
