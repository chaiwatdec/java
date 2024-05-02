package java_hw_super_extra_4;

import java.util.Scanner;

public class ED_6
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();

		int b = 1;
		while (b * 2 <= a)
		{
			b = b * 2;
		}

		System.out.println(b);
		
		sc.close();
	}
}
