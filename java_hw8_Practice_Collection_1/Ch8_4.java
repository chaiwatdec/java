package java_hw8_Practice_Collection_1;

import java.util.Scanner;

public class Ch8_4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int amount = sc.nextInt();
		sc.nextLine();

		String[] stdid = new String[amount];
		double[] point = new double[amount];

		for (int i = 0; i < amount; i++)
		{
			// System.out.println(parts.length);
			String line = sc.nextLine();

			if (i > 2)
			{
				String[] parts = line.split(",");

				stdid[i] = parts[0];

				point[i] = 0;
				for (int j = 1; j < parts.length; j++)
				{
					point[i] = point[i] + Integer.parseInt(parts[j]);
				}
			}
		}

		for (int i = 3; i < amount; i++)
		{
			System.out.println(point[i]);
		}

		sc.close();
	}
}
