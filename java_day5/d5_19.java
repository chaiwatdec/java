package java_day5;

public class d5_19
{
	public static void main(String[] args)
	{
		int a[] = new int[]
		{ 5, 2, 7, 10, 1, 3, 9 };
		int b;
		b = max(a);
		System.out.println(b);
	}

	public static int max(int[] k)
	{
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < k.length; i++)
		{
			if (max < k[i])
			{
				max = k[i];
			}
		}
		return max;
	}
}
