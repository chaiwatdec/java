package java_homework;

import java.util.Scanner;

public class E5_9
{

	public static void main(String[] args)
	{
		int v1, v2, area, line;

		Scanner sc = new Scanner(System.in);

		v1 = sc.nextInt();
		v2 = sc.nextInt();

		area = v1*v2;
		line = (v1+v2)*2;

		System.out.println(area);
		System.out.println(line);

		sc.close();

	}

}
