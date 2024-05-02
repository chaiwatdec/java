package java_day5;

import java.util.Scanner;

public class d5_8
{

	public static void main(String[] args)
	{
		int[] x = new int[5];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < x.length; i++)
		{
			x[i] = sc.nextInt();
		}

		for (int i = x.length-1; i > 0; i--)
		{
			System.out.print(x[i] + (i!=1 ? "," : ""));
		}
		
		
		sc.close();

	}

}
