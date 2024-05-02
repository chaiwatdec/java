package java_hw_05_ED;

import java.util.Scanner;

public class EH9
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		double i = 0, sum = 0;
		while (i < 5)
		{
			double n = sc.nextDouble();

			sum = sum + n;
			i++;
		}

		System.out.println(sum);
		System.out.println(sum / i);

		sc.close();
	}
}
