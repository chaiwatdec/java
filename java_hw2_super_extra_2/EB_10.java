package java_hw_super_extra_2;

public class EB_10
{

	public static void main(String[] args)
	{
		double pi = 0, n = 50000, i = 1;

		while (i <= n)
		{

			pi += Math.pow(-1, i +1) / (2 * i - 1);
			
				i++;
		}
		System.out.println(4*pi);
	}

}
