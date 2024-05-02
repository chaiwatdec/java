package java_hw7_FUNC_ED;

import java.util.Scanner;

public class ed6
{
	public int ed6f(int a)
	{
		int i = 1;
		while (i * 2 <= a)
		{
			i = i * 2;
		}
		return i;
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		int result = (new ed6()).ed6f(a);

		System.out.println(result);

		sc.close();
	}
}
