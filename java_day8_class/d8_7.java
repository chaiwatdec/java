package java_day8_class;

import java.util.Scanner;

public class d8_7
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s;
		s = "" + n; // concatenation
		System.out.println(s.charAt(0));
		sc.close();
	}
}
