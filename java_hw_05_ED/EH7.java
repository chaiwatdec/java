package java_hw_05_ED;

import java.util.Scanner;

public class EH7
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int[] n = new int[10];
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < n.length; i++)
		{

			n[i] = sc.nextInt();

			if (max < n[i])
			{
				max = n[i];
			}
		}

		System.out.println(max);

		sc.close();
	}
}
