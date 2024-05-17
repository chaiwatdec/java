package java_hw8_Practice_Collection_1;

import java.util.Scanner;

public class Ch1_3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		// double no1 = sc.nextDouble();

		double sum = 0;

		for (int i = 0; i < 5; i++)
		{
			double num = sc.nextDouble();
			sum += num;
		}

		double avg=sum/5;
		
		System.out.println(avg);
		
		sc.close();
	}
}
