package java_hw_super_extra_1;

import java.util.Scanner;

public class EA3
{

	public static void main(String[] args)
	{
		double T,l,g;

		Scanner sc = new Scanner(System.in);
		T = sc.nextDouble();
		l = sc.nextDouble();
		
		g = (Math.pow(T/2*(Math.PI),2))/l;
		
		g= l/((T/(2*(Math.PI)))*(T/(2*(Math.PI))));
		
		System.out.println(g);
		
		sc.close();
	}

}
