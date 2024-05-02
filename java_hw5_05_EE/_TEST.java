package java_hw5_05_EE;

public class _TEST
{

	public static void main(String[] args)
	{
		double x[][] = new double[2][5];

		System.out.println(x.length);
		System.out.println(x[0].length);

		System.out.println(fac(5));
	}

	
	public static int fac(int n)
	{
		int fac = 1;
		for (int i = 1; n > i; n--)
		{

			fac = fac * n;
		}

		return fac;
	}

}
