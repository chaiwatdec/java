package java_hw8_Practice_Collection_1;

import java.util.Scanner;

public class Ch1_4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		double weight = sc.nextDouble();
		double height = sc.nextDouble();

		double body_surface = 3.207 * Math.pow(10, -4) * Math.pow(height, 0.3)
        * (Math.pow(1000 * weight, (0.7285 - (0.0188 * (3 + Math.log10(weight))))));

		System.out.println(body_surface);
		sc.close();
	}
}
