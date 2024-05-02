package java_hw_04_EA;

import java.util.Scanner;

public class EA4212
{

	public static void main(String[] args)
	{
		double x;

		Scanner sc = new Scanner(System.in);
		x = sc.nextDouble();

		if (x >= 3)
		{
			System.out.println("100");
		} else if (x >= 2.1)
		{
			System.out.println("70");
		} else if (x >= 1.1)
		{
			System.out.println("60");
		} else if (x >= 0)
		{
			System.out.println("50");
		}
		sc.close();
	}
}
