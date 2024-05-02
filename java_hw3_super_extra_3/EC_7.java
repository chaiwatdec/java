package java_hw_super_extra_3;

import java.util.Arrays;
import java.util.Scanner;

public class EC_7
{

	public static void main(String[] args)
	{
		//a extend b
		int a[] = new int[10];
		int b[] = new int[10];
		int c[] = new int[20];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < b.length; i++)
		{
			b[i] = sc.nextInt();
		}

		for (int i = 0; i < a.length; i++)
		{
			c[i] = a[i];
		}

		for (int i = 0; i < b.length; i++)
		{
			c[i + a.length] = b[i];
		}
		
		System.out.println(Arrays.toString(c));
		sc.close();
	}
}
