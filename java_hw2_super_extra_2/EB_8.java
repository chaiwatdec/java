package java_hw_super_extra_2;

import java.util.Scanner;

public class EB_8
{

	public static void main(String[] args)
	{
		long N, i = 1, j=1;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();

		while (j <= N)
		{
			i = i * j;
			j++;
		}
		System.out.println(i);
		sc.close();
	}

}
