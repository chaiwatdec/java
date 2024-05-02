package java_hw_04_EA;


import java.util.Scanner;

public class EA425
{

	public static void main(String[] args)
	{
		int a, b, c, m, y;

		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		m = sc.nextInt();

		if (m > 5)
		{
			y = (a * m * 2) + (b * m) + c;

		} else if (m == 5)
		{
			y = (a * m * 2) + (b * m) - c;
		} else
		{
			y = (a * m * 2) + (b * m);
		}

		System.out.println(y);

		sc.close();
	}

}
