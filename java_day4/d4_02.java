package java_day4;

import java.util.Scanner;

public class d4_02
{

	public static void main(String[] args)
	{
		int n;
		int sum = 0;

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		int i = 1;
		while (i <= n)
		{
			sum = sum + i;
			i++;
		}
		System.out.println(sum);
		sc.close();
	}

}
