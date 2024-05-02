package java_day7_rec_class;

public class d7_1_recu
{
	public static long facto(int n)
	{
		long fac = 1; // long 2,147,483,647
		for (int i = 1; i <= n; i++)
		{
			fac = fac * i;
		}
		return fac;
	}

	public static long facto2(int n) // recursive
	{
		if (n == 0 || n == 1)
		{
			return 1;
		}
		return n * facto2(n - 1);
	}

	public static void main(String[] args)
	{
		System.out.println(facto(5));
		System.out.println(facto2(5));
		System.out.println();

		long start, stop;
		start = System.currentTimeMillis();
		for (int i = 0; i <= 100000; i++)
		{
			facto(i);
		}
		stop = System.currentTimeMillis();
		System.out.println("facto");
		System.out.println(stop - start);

		start = System.currentTimeMillis();
		for (int i = 0; i <= 10000; i++)
		{
			facto2(i);
		}
		stop = System.currentTimeMillis();
		System.out.println("facto2");
		System.out.println(stop - start);
	}
}