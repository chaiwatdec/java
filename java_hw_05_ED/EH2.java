package java_hw_05_ED;

import java.util.Scanner;

public class EH2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double csh = sc.nextInt();
		double itr = sc.nextInt();

		double cshitr=0;
		int yrs = 10;
		for (int i = 1; i <= yrs; i++)
		{
				cshitr=(cshitr+csh)*((100+itr)/100);
		}
		System.out.println(cshitr);

		sc.close();
	}
}
