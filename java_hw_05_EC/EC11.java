package java_hw_05_EC;

import java.util.Arrays;
import java.util.Scanner;

public class EC11
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int number, lastdigit;
		int cnumber[] = new int[4];
		number = sc.nextInt();

		for (int i = cnumber.length - 1; i >= 0; i--)
		{
			lastdigit = number % 10;
			cnumber[i] = lastdigit;
			// System.out.println(lastdigit);
			number = number / 10;
		}
		System.out.println(Arrays.toString(cnumber));
		sc.close();
	}
}
