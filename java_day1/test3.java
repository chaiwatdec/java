package java_day1;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your score");
		Scanner sc = new Scanner(System.in);

		int k;
		k = sc.nextInt();
		if (k < 50) {
			System.out.println("F");
		} else if (k < 60) {
			System.out.println("E");
		} else if (k < 70) {
			System.out.println("D");
		} else if (k < 80) {
			System.out.println("C");
		} else if (k < 90) {
			System.out.println("B");
		} else if (k <= 100) {
			System.out.println("A");
		}

	}

}
