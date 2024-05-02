package java_day13;

public class _ex4
{
	public static void main(String[] args)
	{
		// https://docs.oracle.com/javase/tutorial/java/data/numberformat.html
		long x = 15684352;
		String s = String.format("%d", x);
		System.out.println(s);

		double xx = 15.684352;
		String ss = String.format("%.3f", xx);
		System.out.println(ss);

		long xxx = 15684352;
		String sss = String.format("%+d", xxx);
		System.out.println(sss);

		int[] y = new int[10];
		try
		{
			y[10] = 10;
		} catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
