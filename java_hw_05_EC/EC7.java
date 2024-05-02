package java_hw_05_EC;

import java.util.Scanner;

public class EC7
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num, nump = 0, renum = 0;
		num = sc.nextInt();

		while (num != 0)
		{
			nump = num % 10;
			renum = renum * 10 + nump;
			num = num / 10;
		}
		System.out.println(renum);
		sc.close();
	}
}
