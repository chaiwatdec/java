package java_hw_04_EA;


import java.util.Scanner;

public class EA41
{

	public static void main(String[] args)
	{
		int a, b, c;

		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		if (a > 13)
		{
			if (b != 6)
			{
				System.out.println("A");
			} else
			{
				if (c <= 7)
				{
					System.out.println("B");
				} else
				{
					System.out.println("C");
				}
			}

		} else
		{
			if (b <= 16)
			{
				System.out.println("D");
			} else
			{
				if (c > 6)
				{
					System.out.println("E");
				} else
				{
					System.out.println("F");
				}
			}
		}

		sc.close();
	}

}
