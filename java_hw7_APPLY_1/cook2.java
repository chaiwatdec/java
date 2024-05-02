package java_hw7_APPLY_1;

import java.util.Scanner;

public class cook2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int rice = Integer.parseInt(sc.nextLine());	
		int water = Integer.parseInt(sc.nextLine());	
		
		RiceCooker obj = new RiceCooker();
		obj.addRice(rice);
		obj.addWater(water);
		System.out.println(obj.getRice());
		System.out.println(obj.getWater());
		
		sc.close();
	}
}
