package java_hw7_FUNC_VECTOR;

import java.util.Scanner;

public class vector2d5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		Vector2D vector1 = new Vector2D();
		vector1.X = sc.nextDouble();
		vector1.Y = sc.nextDouble();

		Vector2D r = vector1.unit();

		System.out.println(r.X);
		System.out.println(r.Y);
		
		sc.close();
	}
}