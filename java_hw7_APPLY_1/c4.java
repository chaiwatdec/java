package java_hw7_APPLY_1;

import java.util.Scanner;

public class c4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String model = sc.nextLine();	
		double v1 = Double.parseDouble(sc.nextLine());
		double v2 = Double.parseDouble(sc.nextLine());
		double v3 = Double.parseDouble(sc.nextLine());
		
		Car obj = new Car(model);
		
		obj.addFuel(v1);
		obj.setSpeed(v2);
		obj.startEngine(v3);

		sc.close();
	}
}
