package java_hw6_06_EF;

import java.util.Scanner;

public class EF3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int ha = sc.nextInt();
		int ma = sc.nextInt();
		int hb = sc.nextInt();
		int mb = sc.nextInt();

		int cal = 0, calh = 0, calm = 0;

		if (ha > hb)
		{

			cal = (((hb + 12) * 60) + mb) - ((ha * 60) + ma);
			calh = cal / 60;
			calm = cal % 60;
		} else
		{
			cal = (((hb) * 60) + mb) - ((ha * 60) + ma);
			calh = cal / 60;
			calm = cal % 60;
		}

		System.out.println(calh);
		System.out.println(calm);
		
		sc.close();
	}
}