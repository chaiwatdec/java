package java_hw_super_extra_3;

import java.util.Scanner;

public class EC_1
{

	public static void main(String[] args)
	{
		int count = 0;
		int[] x = new int[10];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < x.length; i++)
		{
			x[i] = sc.nextInt();

			if (x[i] >=10)
			{
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}

}
