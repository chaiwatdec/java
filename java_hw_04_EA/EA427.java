package java_hw_04_EA;


import java.util.Scanner;

public class EA427
{

	public static void main(String[] args)
	{
		int a;

		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();

		if (a >= 0)
		{
			System.out.println("POSITIVE INTEGER");
		} else
		{
			System.out.println("NOT POSITIVE INTEGER");
		}

		sc.close();
	}

}
