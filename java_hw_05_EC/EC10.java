package java_hw_05_EC;

public class EC10
{

	public static void main(String[] args)
	{
		double h, j;
		h = 0;
		j = 10;

		for (double n = 1; n <= j; n++)
		{
			h = h + (1 / n);
			System.out.println(h);
		}

	}

}
