package java_homework;

import java.util.Scanner;

public class E5_15
{

	public static void main(String[] args)
	{
		double w, h, mos, dub, boyd;

		Scanner sc = new Scanner(System.in);

		w = sc.nextDouble();
		h = sc.nextDouble();

		mos = Math.sqrt((w * h) / 3600);

		dub = (71.84 * Math.pow(w, 0.425) * Math.pow(h, 0.725))/10000;

		boyd = 0.0003207 * Math.pow(h, 0.3) * Math.pow((1000 * w), (0.7285 - (0.0188 * (3 + Math.log10(w)))));


		System.out.println(mos);
		System.out.println(dub);
		System.out.println(boyd);

		sc.close();
	}

}
