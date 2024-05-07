package java_hw7_APPLY_1;

import java.util.Scanner;

public class std1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < n; i++)
		{
			String txt = sc.nextLine();
			Student obj = new Student(txt);
		}

		sc.close();
	}
}
