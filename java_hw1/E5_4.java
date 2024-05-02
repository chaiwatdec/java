package java_homework;

import java.util.Scanner;

public class E5_4
{

	public static void main(String[] args)
	{
		Double cm, lah, foot;
		int inch;

		Scanner sc = new Scanner(System.in);

		inch = sc.nextInt();

		foot = (double) inch / 12;
		cm = inch * 2.54;
		lah = (double) (double) inch / 36;

		System.out.println(foot);
		System.out.println(cm);
		System.out.println(lah);

		sc.close();
	}
}
