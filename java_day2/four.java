package java_day2;

import java.util.Scanner;

public class four {

	public static void main(String[] args) {
		double R, p, l, A;
		p = 1.59e-8;

		Scanner sc = new Scanner(System.in);

		System.out.print("Input Area and length: ");
		A = sc.nextDouble();
		l = sc.nextDouble();
		R = (p * l) / A;
		System.out.println(R);
		sc.close();
	}

}
