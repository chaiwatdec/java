package java_hw_super_extra_2;

import java.util.Scanner;

public class EB_1
{

	public static void main(String[] args)
	{
		double avg, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

		double v, sum = 0;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 10; i++)
		{
			v = sc.nextInt();
			sum = sum + v;
			if (v < min)
			{
				min = v;
			} else if (v > max)
			{
				max = v;
			}

		}

		avg = sum / 10;

		System.out.println(avg);
		System.out.println(min);
		System.out.println(max);
		sc.close();

	}

}
