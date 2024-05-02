package java_hw_05_ED;

import java.util.Scanner;

public class EH3_2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		String strn = String.valueOf(n);

		int cntkee = 0, cntkuu = 0;

		for (int i = 0; i < strn.length(); i++)
		{
			if ((Character.getNumericValue(strn.charAt(i))) % 2 == 0)
			{
				cntkuu++;
			} else
			{
				cntkee++;
			}
		}

		System.out.println(cntkuu);
		System.out.println(cntkee);
		sc.close();
	}
}
