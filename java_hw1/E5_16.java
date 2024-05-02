package java_homework;

import java.util.Scanner;

public class E5_16
{

	public static void main(String[] args)
	{
		int s, moitv, ditv, hitv, mitv, sitv;

		double rmy, rmmo, rmd, rmh, rmm, rms;

		Scanner sc = new Scanner(System.in);
		s = sc.nextInt();

		sitv = 60;
		mitv = 60;
		hitv = 24;
		ditv = 30;
		moitv = 12;
		//yitv = 12;

		rms = s % sitv;
		rmm = s / sitv % mitv;
		rmh = (s / (sitv * mitv)) % hitv;
		rmd = (s / (sitv * mitv * hitv)) % ditv;
		rmmo = (s / (sitv * mitv * hitv * ditv)) % moitv;
		rmy = s / (sitv * mitv * hitv * ditv * moitv);

		System.out.println(rmy + "y");
		System.out.println(rmmo + "mo");
		System.out.println(rmd + "d");
		System.out.println(rmh + "h");
		System.out.println(rmm + "m");
		System.out.println(rms + "s");
		sc.close();

	}

}
