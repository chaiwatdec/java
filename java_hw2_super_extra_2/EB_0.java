package java_hw_super_extra_2;

import java.util.Scanner;

public class EB_0
{

	public static void main(String[] args)
	{
		int v, sum = 0;
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 10; i++)
		{	
			v = sc.nextInt();
			sum = sum + v;
		}

		sc.close();
		System.out.println(sum);

	}

}
