package java_hw7_FUNC_VECTOR;

import java.util.Scanner;

public class vector3d4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		Vector3D vector1 = new Vector3D();
		vector1.X = sc.nextDouble();
		vector1.Y = sc.nextDouble();
		vector1.Z = sc.nextDouble();

		double r = vector1.size();

		System.out.println(r);

		sc.close();
	}
}