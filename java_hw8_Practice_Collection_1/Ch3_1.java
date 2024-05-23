package java_hw8_Practice_Collection_1;

import java.util.Scanner;

public class Ch3_1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int amount = sc.nextInt();

		double sum = 0;

		for (int i = 0; i < amount; i++)
		{
			double number = sc.nextDouble();
			sum = sum + number;
		}

		if (amount == 0)
		{
			System.out.println("No Data");
		} else
		{
			System.out.println(sum / amount);
		}

		sc.close();
	}
}
