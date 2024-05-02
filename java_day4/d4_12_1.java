package java_day4;

import java.util.Scanner;

public class d4_12_1
{

	public static void main(String[] args)
	{
		int n;
		int i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input n: ");
		n = sc.nextInt();

		while (i<n)
		{
			System.out.print("*");
			i++;
		}
		sc.close();
	}

}
