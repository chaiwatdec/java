package java_hw8_Practice_Collection_1;

import java.util.Scanner;

public class Ch4_5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();

		String[] parts = s.split(" ");
		int amount = Integer.parseInt(parts[0]);
		int sort = Integer.parseInt(parts[1]);

		int[] x = new int[amount];

		for (int i = 0; i < x.length; i++)
		{
			x[i] = sc.nextInt();

		}

		if (sort == 0)
		{
			// sort min to max by selection sort
			for (int j = 0; j < x.length; j++)
			{
				int min = Integer.MAX_VALUE;
				int min_index = -1;
				for (int i = j; i < x.length; i++)
				{
					if (x[i] < min)
					{
						min = x[i];
						min_index = i;
					}
				}

				int swap;
				swap = x[j];
				x[j] = x[min_index];
				x[min_index] = swap;
			}
		} else
		{
			// sort max to min by selection sort
			for (int j = 0; j < x.length; j++)
			{
				int min = Integer.MAX_VALUE;
				int min_index = -1;
				for (int i = 0; i < x.length - j; i++)
				{
					if (x[i] < min)
					{
						min = x[i];
						min_index = i;
					}
				}

				int swap;
				swap = x[x.length - j - 1];
				x[x.length - j - 1] = x[min_index];
				x[min_index] = swap;
			}
		}

		// print per lines
		for (int i = 0; i < x.length; i++)
		{
			System.out.println(x[i]);
		}

		sc.close();
	}

}