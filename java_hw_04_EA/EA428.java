package java_hw_04_EA;


import java.util.Scanner;

public class EA428
{

	public static void main(String[] args)
	{
		int a;

		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();

		if (a % 2 == 0)
		{
			System.out.println("EVEN NUMBER");
		} else
		{
			System.out.println("ODD NUMBER");
		}

		sc.close();
	}

}
