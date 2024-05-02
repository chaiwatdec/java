package java_homework;

import java.util.Scanner;

public class E5_10
{

	public static void main(String[] args)
	{
		double f0 , f1, v;
		f0 = 2e10;
		
		Scanner sc = new Scanner(System.in);

		f1 = sc.nextDouble();
		
		v = (10.7585e8)*((f1-f0)/(f1+f0));
		
		
		System.out.println(v);
		

		sc.close();

	}

}
