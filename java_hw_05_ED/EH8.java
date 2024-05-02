package java_hw_05_ED;

import java.util.Scanner;

public class EH8
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int[] n = new int[10];
		int max = Integer.MIN_VALUE + 10;
		long max_sec = Integer.MIN_VALUE;
	
		for (int i = 0; i < n.length; i++)
		{

			n[i] = sc.nextInt();

			if (max < n[i])
			{
				max_sec = max;
				max = n[i];
			} else if (max_sec < n[i] && n[i] != max)
			{
				max_sec = n[i];
			}
		}

		System.out.println(max_sec);

		sc.close();
	}
}
