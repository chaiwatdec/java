package java_hw_05_EC;

import java.util.Scanner;

public class EC6
{

	public static void main(String[] args)
	{
		double v, sum = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

		double avg, lp;

		Scanner sc = new Scanner(System.in);

		lp = sc.nextInt();

		for (int i = 1; i <= lp; i++)
		{

			v = sc.nextInt();
			sum = sum + v;

			if (v > max)
			{
				max = v;
			}
			if (v < min)
			{
				min = v;
			}

		}

		avg = sum / lp;
		System.out.println(min);
		System.out.println(max);
		System.out.println(avg);
		
		sc.close();

	}

}
