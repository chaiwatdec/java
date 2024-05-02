package java_hw_super_extra_1;

import java.util.Scanner;

public class EA5
{

	public static void main(String[] args) {
		
		//151 x,443 lham nachua,345 shak maitao
		int a, b, c, max, x, y, m, n;

		Scanner sc = new Scanner(System.in);

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		if (a >= b && b >= c) {
			max = a;
			x = b;
			y = c;
		} else if (b >= c && b >= a) {
			max = b;
			x = a;
			y = c;
		} else {
			max = c;
			x = a;
			y = b;
		}

		if (x + y <= max) {
			System.out.println("is not triangle");
			sc.close();
			return;
		}
		m = max * max;
		n = (x * x) + (y * y);
		if (m > n) {
			System.out.println("obtuse triangle");
		} else if (m < n) {
			System.out.println("acute-angled triangle");
		} else {
			System.out.println("right triangle");
		}

		if (a == b && b == c) {
			System.out.println("equilateral triangle");
		} else if (a == b || b == c || a == c) {
			System.out.println("isosceles triangle");
		} else {
			System.out.println("scalene triangle");
		}
		sc.close();
	}
}
