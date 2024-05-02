package java_hw_04_EA;

import java.util.Scanner;

public class EA4211
{

	public static void main(String[] args)
	{
		int x, y;

		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();

		if (x >= 100)
		{
			y = 20;
		} else
		{
			y = 0;
		}
		System.out.println(y);
		sc.close();
	}

}
