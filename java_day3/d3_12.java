package java_day3;

import java.util.Scanner;

public class d3_12
{

	public static void main(String[] args)
	{
		double n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextDouble();

		double i = 1, sum = 0;
		while (i <= n)
		{
			sum = sum + (1 / (i * i));
			System.out.println(sum);
			i++;
		}

		sc.close();
	}

}
