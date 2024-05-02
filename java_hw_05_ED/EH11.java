package java_hw_05_ED;

import java.util.Scanner;

public class EH11
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int cntp = 0, cnts = 0;
		double sump = 0, sums = 0;

		while (true)
		{
			double n = sc.nextDouble();

			if (n > 0)
			{
				sump = sump + n;
				cntp++;
			} else if (n < 0)
			{

				sums = sums + n;
				cnts++;
			} else if (n == 0)
			{
				break;
			}

		}

		System.out.println(sump / cntp);
		System.out.println(sums / cnts);

		sc.close();
	}
}
