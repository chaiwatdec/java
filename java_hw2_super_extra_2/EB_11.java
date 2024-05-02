package java_hw_super_extra_2;

import java.util.Scanner;

public class EB_11
{

	public static void main(String[] args)
	{
		double sum = 0, n = 0, count = 0;
		Scanner sc = new Scanner(System.in);
		double avg;
		for (;;)
		{
			n = sc.nextInt();

			if (n < 0)
			{
				System.out.println("ERROR");
				continue;
			} else if (n == 0)
			{
				sc.close();
				break;
			} else
			{
				sum = sum + n;
				count++;
			}

		}
		
		if (count != 0)
		{
			avg = sum / count;
			System.out.println(avg);
		} else
		{
			System.out.println("NO AVERAGE");
		}

	}
}
