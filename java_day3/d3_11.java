package java_day3;

import java.util.Scanner;

public class d3_11
{

	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		double sum = 0;
		int i = 1; 
		while (i <= n)
		{
			sum = sum + 10/i;
			System.out.println(sum);
			i++;
		}

		sc.close();
	}

}
