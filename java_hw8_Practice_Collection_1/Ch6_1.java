package java_hw8_Practice_Collection_1;

import java.util.Scanner;

public class Ch6_1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int year = sc.nextInt();
		year = year - 543;

		int daysInFeb = getDaysInFeb(year);

		System.out.println("Day=" + daysInFeb);
		
		sc.close();
	}

	public static int getDaysInFeb(int year)
	{
		if (isLeapYear(year))
		{
			return 29;
		} else
		{
			return 28;
		}
	}

	public static boolean isLeapYear(int year)
	{
		if (year % 4 == 0)
		{
			if (year % 100 == 0)
			{
				if (year % 400 == 0)
				{
					return true;
				} else
				{
					return false;
				}
			} else
			{
				return true;
			}
		} else
		{
			return false;
		}
	}

}
