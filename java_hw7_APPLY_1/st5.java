package java_hw7_APPLY_1;

import java.util.Scanner;

public class st5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int isPlug = Integer.parseInt(sc.nextLine());
		int hasPan = Integer.parseInt(sc.nextLine());
		int min = Integer.parseInt(sc.nextLine());
		int sec = Integer.parseInt(sc.nextLine());
		String mode = sc.nextLine();

		Stove obj = new Stove(isPlug);

		obj.putPan(hasPan);
		obj.setTime(min, sec);
		obj.selectMode(mode);
		obj.cook();
		obj.unplug();

		sc.close();
	}
}