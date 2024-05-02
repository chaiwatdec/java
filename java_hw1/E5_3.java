package java_homework;

import java.util.Scanner;

public class E5_3
{

	public static void main(String[] args)
	{
		Double R, Area;

		Scanner sc = new Scanner(System.in);

		Area = sc.nextDouble();

		R = Math.sqrt(Area / Math.PI);

		System.out.println(R);

		sc.close();
	}
}
