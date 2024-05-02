package java_hw_04_EA;

import java.util.Scanner;

public class EA4218
{

	public static void main(String[] args)
	{
		int a;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		
		if (a>30) {
			System.out.println("TOO OLD");
		}
		sc.close();
	}

}
