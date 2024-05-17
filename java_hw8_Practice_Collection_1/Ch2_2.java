package java_hw8_Practice_Collection_1;

import java.util.Scanner;

public class Ch2_2
{
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);

		double sum = 0;
		int i = 0;

		while (true)
		{
			double input = sc.nextDouble();

			if (i == 0 && (input == -1 || input == 0))
			{
				System.out.println("No Data");
				break;
			}

			if (input == -1)
			{
				break;
			}

			sum = sum + input;

			i++;
		}

		if (i > 0)
		{
			System.out.println(sum / i);
		}
		sc.close();
	}
}
