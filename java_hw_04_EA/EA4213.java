package java_hw_04_EA;

import java.util.Scanner;

public class EA4213
{

	public static void main(String[] args)
	{
		double a, b, c;

		Scanner sc = new Scanner(System.in);
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		if (a == 1)
		{
			System.out.println(b + c);
		} else if (a == 2)
		{
			System.out.println(b * c);
		} else if (a == 3)
		{
			System.out.println(b / c);
		} else
		{
			System.out.println("please select only 1-3");
		}
		sc.close();
	}

}
