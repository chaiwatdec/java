package java_hw_05_ED;

import java.util.Scanner;

public class EH4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= 12; i++)
		{
			System.out.println(n + " * " + i + " = " + n * i);
		}
		sc.close();
	}
}
