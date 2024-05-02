package java_hw_super_extra_2;

public class EB_4
{

	public static void main(String[] args)
	{
		int i = 0;
		double a = 50000000;
		double b = 70000000;

		while (a <= b)
		{
			a = a * 1.03;
			b = b * 1.02;
			i++;
		}
		System.out.println(i);
	}

}
