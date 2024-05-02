package java_hw7_FUNC_ED;

import java.util.Scanner;

public class ed9
{
	public int ed9f(int n)
	{
		while (n >= 10)
		{
			n = n / 10;
		}
		return n;
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		int result = (new ed9()).ed9f(a);

		System.out.println(result);

		sc.close();
	}
}
