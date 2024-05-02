package java_homework;

import java.util.Scanner;

public class E5_13
{

	public static void main(String[] args)
	{
		double x, n;

		Scanner sc = new Scanner(System.in);

		n = sc.nextDouble();

		x = (Math.sqrt(2*(Math.PI)*n))*(Math.pow((n/Math.E), n));
		
		System.out.println(x);

		sc.close();

	}

}
