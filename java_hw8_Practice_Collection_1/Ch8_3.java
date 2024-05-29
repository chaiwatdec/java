package java_hw8_Practice_Collection_1;

import java.util.Scanner;

public class Ch8_3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int amount = sc.nextInt();
		sc.nextLine();

		String[] foodItems = new String[amount];
		int[] foodPrices = new int[amount];

		for (int i = 0; i < amount; i++)
		{
			String line = sc.nextLine();
			String[] parts = line.split("\t");

			foodItems[i] = parts[0];
			foodPrices[i] = Integer.parseInt(parts[1]);
		}

		int[][] dailyIncome = new int[amount][5];

		for (int i = 0; i < amount; i++)
		{
			String line = sc.nextLine();
			String[] parts = line.split("\t");

			for (int j = 0; j < 5; j++)
			{
				dailyIncome[i][j] = Integer.parseInt(parts[j + 1]);
			}
		}

		double[] totalIncome = new double[5];

		for (int i = 0; i < amount; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				totalIncome[j] = totalIncome[j] + (foodPrices[i] * dailyIncome[i][j]);
			}
		}

		for (int i = 0; i < 5; i++)
		{
			System.out.println(totalIncome[i]);
		}

		sc.close();
	}
}
