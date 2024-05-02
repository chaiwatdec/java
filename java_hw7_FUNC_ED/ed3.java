package java_hw7_FUNC_ED;

import java.util.Scanner;

public class ed3
{
	public int ed3f(int a, int b)
	{
		int max;

		if (a > b)
		{
			max = a;
		} else
		{
			max = b;
		}

		return max;
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int result = (new ed3()).ed3f(a, b);

		System.out.println(result);

		sc.close();
	}
}
