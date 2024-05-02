package java_homework;

import java.util.Scanner;

public class E5_6
{
	public static void main(String[] args)
	{
		Double v1, v2, v3, sum, avg;

		Scanner sc = new Scanner(System.in);

		v1 = sc.nextDouble();
		v2 = sc.nextDouble();
		v3 = sc.nextDouble();

		sum = v1 + v2 + v3;
		avg = (v1 + v2 + v3) / 3;

		System.out.println(sum);
		System.out.println(avg);

		sc.close();
	}

}
