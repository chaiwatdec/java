package java_hw_05_ED;

import java.util.Scanner;

public class EH10
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int sump = 0, sums = 0;
		
		while (true)
		{
			int n = sc.nextInt();

			if (n > 0)
			{
				sump = sump + n;
			} else if (n < 0)
			{

				sums = sums + n;
			} else if (n == 0)
			{
				break;
			}

		}

		System.out.println(sump);
		System.out.println(sums);
		
		sc.close();
	}
}
