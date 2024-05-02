package java_hw_super_extra_3;

import java.util.Scanner;

public class EC_2
{
	public static void main(String[] args)
	{
		int countv = 0, v;
		int[] x = new int[10];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < x.length; i++)
		{
			x[i] = sc.nextInt();
		}

		v = sc.nextInt();

		for (int i = 0; i < x.length; i++)
		{
			if (x[i] == v)
			{
				countv++;
				break;
			} 
		}

		if (countv == 0)
		{
			System.out.println("is not in array");
		} else
		{
			System.out.println("is in array");
		}
		
		sc.close();
	}
}
