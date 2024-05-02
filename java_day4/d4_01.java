package java_day4;

public class d4_01
{
	public static void main(String[] args)
	{
		int i = 0;
		int count = 0;
		while (i <= 100)
		{
			if (i % 2 == 0)
			{
				// System.out.println();
				count++;
			}
			i++;
		}
		System.out.println(count);
	}

}
