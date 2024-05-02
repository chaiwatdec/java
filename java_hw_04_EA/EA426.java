package java_hw_04_EA;


import java.util.Scanner;

public class EA426
{

	public static void main(String[] args)
	{
		int a, b, c;

		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		
		//c = ((a*60)+b)/60;
		c=((a*60)+b)/60;
		
		System.out.println(c);
		
		sc.close();
	}

}
