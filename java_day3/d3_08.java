package java_day3;

public class d3_08
{

	public static void main(String[] args)
	{
		int i = 0;
		while (i <= 10 - i)
		{
			int x = 1;
			while (x <= 10 - i)
			{
				System.out.print("-");
				x++;
			}
			x = 1;
			while (x < i + 2)
			{
				System.out.print("x");
				x++;
			}
			System.out.println();
			i++;
		}
	}

}
