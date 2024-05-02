package java_day3;

import java.util.Scanner;

public class d3_14
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a;
		a = sc.nextInt();

		int k = 1;
		int count =0 ;

		while (k <= a)
		{
			if (a % k == 0)
			{
				//System.out.println(k);
				count++;
			} else
			{

			}

			k++;
		}
		
		System.out.println(count);
		sc.close();
	}

}
