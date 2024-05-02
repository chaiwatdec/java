package java_hw_05_EC;

import java.util.Arrays;
import java.util.Scanner;

public class EC12
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		int a_temp;

		for (int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}

		a_temp = a[0];
		a[0] = a[1];
		a[1] = a[2];
		a[2] = a[3];
		a[3] = a[4];
		a[4] = a_temp;

		System.out.println(Arrays.toString(a));

		sc.close();
	}
}
