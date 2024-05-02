package java_hw6_06_EF;

import java.util.Scanner;

public class EF4
{
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		int mth = sc.nextInt();
		int tyr = sc.nextInt();

		int cyr = tyr - 543;

		int[] dmth =
		{ 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// leap year
		if ((cyr % 4 == 0 && cyr % 100 != 0) || (cyr % 400 == 0))
		{
			dmth[1] = 29;
		}

		// calculate
		int summth = 0;
		for (int i = 0; i < mth - 1; i++)
		{
			summth = summth + dmth[i];
		}

		System.out.println(summth + day);

		sc.close();
	}
}
