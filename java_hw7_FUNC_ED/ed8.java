package java_hw7_FUNC_ED;

import java.util.Scanner;

public class ed8
{
	public int ed8f(int n)
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
			return 0;
		} else
		{
			return 1;
		}
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		int result = (new ed8()).ed8f(a);

		System.out.println(result);

		sc.close();
	}
}
