package java_day1;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Double weight, height, BMI;

		System.out.print("Enter Weight(kg): ");
		weight = sc.nextDouble();
		System.out.print("Enter Height(cm): ");
		height = sc.nextDouble();

		height = height / 100;
		BMI = weight / (height * height);

		System.out.println("BMI: " + BMI);

		if (BMI < 18.5) {
			System.out.println("thin");
		} else if (BMI > 22.9) {
			System.out.println("fat");
		} else {
			System.out.println("normal");
		}
		sc.close();
	}

}
