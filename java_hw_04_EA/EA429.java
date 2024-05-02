package java_hw_04_EA;

import java.util.Scanner;

public class EA429
{

	public static void main(String[] args)
	{
		int a;

		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();

		if (a <= 100 && a >= 80)
		{
			System.out.println("A");
		} else if (a < 80 && a >= 70)
		{
			System.out.println("B");
		} else if (a < 70 && a >= 60)
		{
			System.out.println("C");
		} else if (a < 60 && a >= 50)
		{
			System.out.println("D");
		} else if (a < 50)
		{
			System.out.println("F");
		}

		sc.close();
	}

}
