package java_day3;

import java.util.Scanner;

public class d3_10
{

	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		int i = 1, fac = 1;
		while (i <= n)
		{
			fac = fac * i;
			System.out.println(fac);
			i++;
		}

		sc.close();
	}

}
