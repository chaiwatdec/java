package java_hw_05_EC;

import java.util.Scanner;

public class EC5
{

	public static void main(String[] args)
	{

		int p;
		double fp = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while (true)
		{
			p = sc.nextInt();

			if (p == -1)
			{
				System.out.println("exit");
				sc.close();
				break;
			} else if (p < 10000)
			{
				fp = (double) p * 0.0;

			} else if (p >= 10000 && p < 25000)
			{
				fp = (double) p * 0.07;

			} else if (p > 25000)
			{
				fp = (double) p * 0.10;
			}
			System.out.println(fp);
		}

	}

}
