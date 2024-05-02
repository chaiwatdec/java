package java_hw7_APPLY_1;

import java.util.Scanner;

public class cook5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int rice = Integer.parseInt(sc.nextLine());
		int water = Integer.parseInt(sc.nextLine());
		String mode = sc.nextLine();
		int hour = Integer.parseInt(sc.nextLine());

		RiceCooker obj = new RiceCooker();
		obj.addRice(rice);
		obj.addWater(water);
		obj.selectMode(mode);
		obj.cookWithTimer(hour);

		sc.close();
	}
}
