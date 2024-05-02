package java_hw7_FUNC_ED;

import java.util.Scanner;

public class ed4
{
	public int ed4f(int a, int b, int c)
	{
		int max = a;

		if (b > max)
		{
			max = b;
		} 
		
		if (c > max)
		{
			max = c;
		}

		return max;
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int result = (new ed4()).ed4f(a, b,c);

		System.out.println(result);

		sc.close();
	}
}
