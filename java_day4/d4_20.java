package java_day4;

import java.util.Scanner;

public class d4_20
{
	public static void main(String[] args)
	{
		int sum = 0, n = 0, count = 0;
		Scanner sc = new Scanner(System.in);
		double avg;
		for (;;)
		{
			n = sc.nextInt();

			
			if (n < 0)
			{
				System.out.println("ERROR");
				continue;
			} 
			else if (n == 0)
			{
				sc.close();
				break;
			} else
			{
				sum = sum + n;
				count++;
			}
			
		}
		avg = (double) sum / count;
		System.out.println(avg);
		
	}

}
