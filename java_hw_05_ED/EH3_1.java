package java_hw_05_ED;

import java.util.Scanner;

public class EH3_1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		String strn = String.valueOf(n);

		int sum = 0;
		for (int i = 0; i < strn.length(); i++)
		{
			sum += Character.getNumericValue(strn.charAt(i));
		}

		System.out.println(sum);
		sc.close();
	}
}
