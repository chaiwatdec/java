package java_day4;

import java.util.Scanner;

public class d4_03
{

	public static void main(String[] args)
	{
		int n;
		int sum = 0;

		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		while (i <= 10)
		{
			System.out.print("Input n: ");
			n = sc.nextInt();
			
			sum = sum + n;
			i++;
		}
		System.out.println(sum);
		sc.close();
	}

}
