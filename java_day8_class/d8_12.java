package java_day8_class;

import java.util.Scanner;

public class d8_12
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);

		if (c == 'a')
		{
			System.out.println("a");
		} else if (c == 'b')
		{
			System.out.println("b");
		} else if (c == 'c')
		{
			System.out.println("c");
		} else
		{
			System.out.println("no");
		}

		sc.close();
	}
}
