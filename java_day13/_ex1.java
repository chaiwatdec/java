package java_day13;

import java.util.ArrayList;

public class _ex1
{
	public static void main(String[] args)
	{
		ArrayList<Integer> x = new ArrayList<Integer>();
		x.add(1);
		x.add(2);
		x.add(3);
		x.add(10);
		x.add(2, 100);
		System.out.println(x.get(2));

		try
		{
			int m = 200;
			int y = 0;
			int z = m / y;
			System.out.println("m/y = " + z);
		} catch (Exception e)
		{
			System.out.println("Error: " + e.getMessage());
		}
	}
}
