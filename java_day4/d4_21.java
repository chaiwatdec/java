package java_day4;

import java.util.Scanner;

public class d4_21
{

	public static void main(String[] args)
	{
		int sum = 0, n = 0, count = 0;
		Scanner sc = new Scanner(System.in);
		double avg;
		for (;;)
		{
			n = sc.nextInt();

			if (n == 0)
			{
				break;
			} else
			{
				sum = sum + n;
				count++;
			}
			
			sc.close();
		}
		avg = (double) sum / count;
		System.out.println(avg);
	}
}
