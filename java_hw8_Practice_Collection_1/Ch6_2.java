package java_hw8_Practice_Collection_1;

import java.util.Scanner;

public class Ch6_2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();

		String[] parts = s.split(" ");
		int amount = Integer.parseInt(parts[0]);
		int number = Integer.parseInt(parts[1]);

		int[] x = new int[amount];
		int count = 0;

		for (int i = 0; i < x.length; i++)
		{
			x[i] = sc.nextInt();

			if (x[i] == number)
			{
				count++;
			}

		}

		System.out.println(count);

		sc.close();
	}
}
