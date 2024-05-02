package java_day5;

public class d5_12
{
	public static void main(String[] args)
	{
		int[] a =
		{ 5, 4, 3, 2, 1 };
		int[] b = new int[5];

		b = a;
		a[0] = 100;

		System.out.println("a[0] is " + a[0] + " and b[0] is " + b[0]);
	}
}
