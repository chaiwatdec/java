package java_homework;

import java.util.Scanner;

public class E5_5
{

	public static void main(String[] args)
	{
		Double F;
		Double C;

		Scanner sc = new Scanner(System.in);

		C = sc.nextDouble();
		
		

		F = (double)((C*9/5) + 32);

		System.out.println(F);

		sc.close();
	}
}
