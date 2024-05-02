package java_hw_super_extra_3;

import java.util.Arrays;
import java.util.Scanner;

public class EC_5
{
	public static void main(String[] args)
	{
		int x[] = new int[10];
		int index, v;

		Scanner sc = new Scanner(System.in);

		// input to array
		for (int i = 0; i < x.length; i++)
		{
			x[i] = sc.nextInt();
		}
		
		v = sc.nextInt();
		index = sc.nextInt();
		
		//swap from end to index
		for (int i = x.length - 1; i > index; i--)
		{
			x[i] = x[i - 1];
		}

		x[index] = v;
		
		System.out.println(Arrays.toString(x));
		sc.close();
	}
}
