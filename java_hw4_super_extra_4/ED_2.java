package java_hw_super_extra_4;

import java.util.Scanner;

public class ED_2
{
	public static void main(String[] args)
	{
		int a[] = new int[2];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println(a[0]+a[1]);
		
		sc.close();
	}
}
