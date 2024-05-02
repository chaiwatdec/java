package java_hw_super_extra_2;

public class EB_9
{
	public static void main(String[] args)
	{
		double h = 0, n = 50000, i = 1;

		while (i <= n)
		{
			h = h + (1 / i);
			i++;
		}
		System.out.println(h);
	}

}
