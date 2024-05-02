package java_day2;

import java.util.Scanner;

public class day_1
{

	public static void main(String[] args)
	{

		double wA, pA, wB, pB, A, B;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter weight of Product A: ");
		wA = sc.nextDouble();

		System.out.println("Enter price of Product A: ");
		pA = sc.nextInt();

		System.out.println("Enter weight of Product B: ");
		wB = sc.nextDouble();

		System.out.println("Enter price of Product B: ");
		pB = sc.nextInt();

		A = wA / pA;
		B = wB / pB;

		System.out.println("Average price of Product A: " + A);
		System.out.println("Average price of Product B: " + B);

		if (A > B)
		{
			System.out.println("A is cheaper");
		} else if (A == B)
		{
			System.out.println("A is equal B");
		} else
		{
			System.out.println("B is cheaper");
		}

		sc.close();
	}

}
