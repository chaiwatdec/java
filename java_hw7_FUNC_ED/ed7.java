package java_hw7_FUNC_ED;

import java.util.Scanner;

public class ed7
{
	public int ed7f(int n)
	{
		int count = 0;
		for (int i = 1; i <= n; i++)
		{
			if (n % i == 0)
			{
				count++;
			}
		}

		if (count == 2)
		{
			return 1;
		} else
		{
			return 0;
		}
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		int result = (new ed7()).ed7f(a);

		System.out.println(result);

		sc.close();
	}
}
