package java_hw8_Practice_Collection_1;

import java.util.Scanner;

public class Ch3_2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int inhr = sc.nextInt();
		int inmin = sc.nextInt();
		int outhr = sc.nextInt();
		int outmin = sc.nextInt();

		if (outhr < inhr)
		{
			outhr = outhr + 24;
		}

		int intsum = (inhr * 60) + inmin;
		int outsum = (outhr * 60) + outmin;

		int prksum = outsum - intsum;

		System.out.println(calParkfee(prksum));

		sc.close();
	}

	public static int calParkfee(int prksum)
	{
		if (prksum <= 15)
		{
			return 0;
		} else if (prksum > 15 && prksum <= 180)
		{
			if (prksum % 60 == 0)
			{
				int cal3 = (prksum / 60);
				return cal3 * 10;
			} else
			{
				int cal3 = (prksum / 60) + 1;
				return cal3 * 10;
			}

		} else if (prksum > 180 & prksum <= 360)
		{
			if (prksum % 60 == 0)
			{
				int cal4 = (prksum / 60) - 3;
				int cal3 = 3 * 10;
				return cal3 + (cal4 * 20);
			} else
			{
				int cal4 = ((prksum / 60) + 1) - 3;
				int cal3 = 3 * 10;
				return cal3 + (cal4 * 20);
			}
		} else
		{
			return 200;
		}
	}
}
