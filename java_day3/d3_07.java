package java_day3;

public class d3_07
{

	public static void main(String[] args)
	{
		int i = 1;
		while (i < 6)
		{
			int x = 5;
			while (x <= 10 - i)
			{
				System.out.print("x");
				x++;
			}

			System.out.println();
			i++;
		}

	}

}
