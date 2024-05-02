package java_hw7_FUNC_ED;

import java.util.Scanner;

public class ed1
{
	public int ed1f(int a, int b)
	{
		int sum = a + b;

		return sum;
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();

		int result = (new ed1()).ed1f(a, b);

		System.out.println(result);

		sc.close();
	}
}
