package java_day4;

public class d4_09
{
	public static void main(String[] args)
	{
		int i = 0;
		double a = 50000000;
		double b = 70000000;

		while (true)
		{
			a = a * 1.03;
			b = b * 1.02;
			i++;

			if (a >= b)
			{
				break;
			}
		}
		System.out.println(a);
		System.out.println(b);
		System.out.print(i);
	}
}
