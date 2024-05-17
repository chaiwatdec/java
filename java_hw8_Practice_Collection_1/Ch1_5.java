package java_hw8_Practice_Collection_1;

import java.util.Scanner;

public class Ch1_5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		double r = sc.nextDouble();

		double area = Math.PI*r*r;

		System.out.println(area);
		sc.close();
	}
}
