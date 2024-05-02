package java_day4;

public class d4_13
{

	public static void main(String[] args)
	{
		int i = 1;

		while (i <= 10)
		{
			if (i % 3 == 0 && i % 5 == 0)
			{
				System.out.print("a");
			} else if (i % 3 == 0)
			{
				System.out.print("b");
			} else if (i % 5 == 0)
			{
				System.out.print("c");
			} else if (i % 7 == 0)
			{
				System.out.print("d");
			} else
			{
				//System.out.print(i);
			}
			System.out.print(i);
			// if (i % 11 == 0)
			// {
			// System.out.println();
			// }
			i++;
		}

	}

}
