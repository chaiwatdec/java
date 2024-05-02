package java_hw_super_extra_4;

import java.util.Scanner;

public class ED_10
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int x[][] = new int[5][7];

		for (int i = 0; i < x.length; i++)
		{
			for (int j = 0; j < x[0].length; j++)
			{
				x[i][j]= sc.nextInt();
			}
		}
		
		for (int i = 0; i < x.length; i++)
		{
			for (int j = 0; j < x[0].length; j++)
			{
				System.out.print(x[i][j] + "\t");
			}
			System.out.println();
		}

		for (int i = 0; i < x.length; i++)
		{
			int sum = 0;

			for (int j = 0; j < x[0].length; j++)
			{
				sum = sum + x[i][j];
			}
			//System.out.println();
			System.out.println(sum);
			
			sc.close();
		}
	}
}
