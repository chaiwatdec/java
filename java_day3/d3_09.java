package java_day3;

import java.util.Scanner;

public class d3_09
{

	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		int i = 1, sum = 0;
		while (i <= n)
		{
			sum = sum + i;
			System.out.println(sum);
			i++;
		}

		sc.close();
	}

}
