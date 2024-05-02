package java_day2;

import java.util.Scanner;

public class five {

	public static void main(String[] args) {
		
		//151 x,443 lham nachua,345 shak maitao
		int a, b, c, max, x, y, m, n;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter 3 values of triangle: ");
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
			return;
		}
		m = max * max;
		n = (x * x) + (y * y);
		if (m > n) {
			System.out.println("phan");
		} else if (m < n) {
			System.out.println("lham");
		} else {
			System.out.println("shak");
		}

		if (a == b && b == c) {
			System.out.println("dantao");
		} else if (a == b || b == c || a == c) {
			System.out.println("nachua");
		} else {
			System.out.println("maitao");
		}
		sc.close();
	}

}
