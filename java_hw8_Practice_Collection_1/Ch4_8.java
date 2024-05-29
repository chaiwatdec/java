package java_hw8_Practice_Collection_1;

import java.util.Scanner;

public class Ch4_8
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		double hypotenuse = sc.nextDouble();

		double side = hypotenuse / Math.sqrt(2);

		double cside = (2 * side)-hypotenuse;

		System.out.println(cside);
		sc.close();
	}
}