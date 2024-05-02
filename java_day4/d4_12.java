package java_day4;

import java.util.Scanner;

public class d4_12
{

	public static void main(String[] args)
	{
		int n;
		int i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input n: ");
		n = sc.nextInt();

		while (i < n)
		{
			int j = 0;

			while (j < (n - i))
			{
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		sc.close();
	}

}
