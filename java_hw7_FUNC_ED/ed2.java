package java_hw7_FUNC_ED;

import java.util.Scanner;

public class ed2
{
	// pass by reference
	public static void ed2f(int a[])
	{
		a[2] = a[0] + a[1];
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int x[] = new int[3];
		x[0] = sc.nextInt();
		x[1] = sc.nextInt();

		// (new ed2()).ed2f(x);
		ed2.ed2f(x);
		System.out.println(x[2]);

		sc.close();
	}
}
