package java_hw_04_EA;

import java.util.Scanner;

public class EA4219
{

	public static void main(String[] args)
	{
		double x,y,a,b,c,d,e,f;
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		d = sc.nextDouble();
		e = sc.nextDouble();
		f = sc.nextDouble();
				
		x = ((e*d)-(b*f))/((a*d)-(b*c));
		y = ((a*f)-(e*c))/((a*d)-(b*c));
		
		System.out.println(x);
		System.out.println(y);
		
		sc.close();
	}

}
