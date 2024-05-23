package java_hw8_Practice_Collection_1;

import java.util.Scanner;
import java.time.YearMonth;

public class Ch3_3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		
		String[] toNumbers = input.split(" ");
		
		int month = Integer.parseInt(toNumbers[0].trim());
		int year = Integer.parseInt(toNumbers[1].trim());
		year = year - 543;
		int days = getDaysInMonth(month, year);

		System.out.println("Day=" + days);
		sc.close();

	}

	public static int getDaysInMonth(int month, int year)
	{
		YearMonth yearMonth = YearMonth.of(year, month);
		return yearMonth.lengthOfMonth();
	}
}
