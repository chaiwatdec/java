package java_hw8_Practice_Collection_1;

import java.util.Scanner;
import java.util.ArrayList;

public class Ch2_8
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> points = new ArrayList<Integer>();

		while (true)
		{
			int point = sc.nextInt();
			if (point < 0)
			{
				break;
			}
			points.add(point);
		}

		for (int i = 0; i < points.size(); i++)
		{
			System.out.println(calGrade(points.get(i)));
		}

		sc.close();
	}

	public static String calGrade(int p)
	{
		if (p > 100)
		{
			return "Error";
		} else if (p >= 80)
		{
			return "A";
		} else if (p >= 75)
		{
			return "B+";
		} else if (p >= 70)
		{
			return "B";
		} else if (p >= 65)
		{
			return "C+";
		} else if (p >= 60)
		{
			return "C";
		} else if (p >= 55)
		{
			return "D+";
		} else if (p >= 50)
		{
			return "D";
		} else if (p < 50)
		{
			return "F";
		} else
		{
			return "Error";
		}
	}

}
