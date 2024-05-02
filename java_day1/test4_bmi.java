package java_day1;

import java.util.Scanner;

public class test4_bmi {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Double weight, height, bmi;

		System.out.print("Enter Weight(kg): ");
		weight = sc.nextDouble();
		System.out.print("Enter Height(cm): ");
		height = sc.nextDouble();

		System.out.println("Weight: " + weight);
		System.out.println("Height: " + height);

		height = height/100;
		bmi = weight / (height*height);

		System.out.println("BMI: " + bmi);

		if (bmi < 18.5) {
			System.out.println("thin");
		} else if (bmi > 22.9) {
			System.out.println("fat");
		} else {
			System.out.println("normal");
		}

	}

}
