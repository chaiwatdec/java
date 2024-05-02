package java_hw_05_ED;

import java.util.Scanner;

public class EH5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int i = 0, sum = 0;
		while (true)
		{
			int n = sc.nextInt();

			if (n == 0)
			{
				break;
			}

			sum = sum + n;
			i++;
		}

		System.out.println(sum);
		System.out.println((double) sum / i);
		
		sc.close();
	}
}
