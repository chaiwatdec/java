package java_hw_super_extra_4;

import java.util.Scanner;

public class ED_5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();

		if (a < 0)
		{
			a = a * -1;
		}

		System.out.println(a);
		sc.close();
	}
}
