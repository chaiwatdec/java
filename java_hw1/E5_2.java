package java_homework;

import java.util.Scanner;

public class E5_2
{

	public static void main(String[] args)
	{
		Double R,Area;

		Scanner sc = new Scanner(System.in);

		R = sc.nextDouble();

		Area = (Math.PI)*(R*R);
		
		System.out.println(Area);
		
		sc.close();
	}

}
