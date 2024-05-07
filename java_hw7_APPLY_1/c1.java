package java_hw7_APPLY_1;

import java.util.Scanner;

public class c1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		String model = sc.nextLine();

		Car obj = new Car(model);

		sc.close();
	}

}
