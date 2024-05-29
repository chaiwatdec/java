package java_hw8_Practice_Collection_1;

import java.util.Scanner;

public class Ch6_6
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		double income = sc.nextDouble();

		System.out.println(calTax(income));

		sc.close();
	}

	public static double calTax(double income)
	{
		double tax = 0.0;

		if (income > 1 & income <= 100000)
		{
			tax = income * 0.05;
		} else if (income >= 100001 & income <= 500000)
		{
			tax = (income * 0.1) - 5000;
		} else if (income >= 500001 & income <= 1000000)
		{
			tax = (income * 0.2) - 50000;
		} else if (income >= 1000001 & income <= 4000000)
		{
			tax = (income * 0.3) - 155000;
		} else if (income >= 4000001)
		{
			tax = (income * 0.37) - 435000;
		}

		return tax;
	}
}
