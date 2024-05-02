package java_hw7_FUNC_VECTOR;

import java.util.Scanner;

public class vector2d4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		Vector2D vector1 = new Vector2D();
		vector1.X = sc.nextDouble();
		vector1.Y = sc.nextDouble();

		double r = vector1.size();

		System.out.println(r);

		sc.close();
	}
}