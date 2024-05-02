package java_hw7_FUNC_VECTOR;

import java.util.Scanner;

public class vector2d3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		Vector2D vector1 = new Vector2D();
		vector1.X = sc.nextDouble();
		vector1.Y = sc.nextDouble();

		Vector2D vector2 = new Vector2D();
		vector2.X = sc.nextDouble();
		vector2.Y = sc.nextDouble();

		double r = vector1.dot(vector2);

		System.out.println(r);

		sc.close();
	}
}
