package java_hw_super_extra_3;

import java.util.Arrays;
import java.util.Scanner;

public class EC_4
{
	public static void main(String[] args)
	{
		int x[] = new int[10];
		int index = -1, v;

		Scanner sc = new Scanner(System.in);

		// input value to array
		for (int i = 0; i < x.length; i++)
		{
			x[i] = sc.nextInt();
		}
		
		v = sc.nextInt();
		
		for (int i = 0; i < x.length; i++)
		{
			if (x[i] == v)
			{
				index = i;
				break;
			}
		}
		
		for (int i = index; i < x.length - 1; i++)
		{
			x[i] = x[i + 1];
		}
		
		x[x.length - 1] = 0;
		System.out.println(Arrays.toString(x));
		sc.close();
	}
}
