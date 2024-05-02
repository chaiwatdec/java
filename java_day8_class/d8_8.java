package java_day8_class;

public class d8_8
{
	public static void main(String[] args)
	{
		int x[][] = new int[2][3];

		for (int i = 0; i < x.length; i++)
		{
			for (int j = 0; j < x[0].length; j++)
			{
				x[i][j] = (int) (Math.random() * 10);
				System.out.print(x[i][j] + "\t");
			}
			System.out.println();
		}

		for (int i = 0; i < x.length; i++)
		{
			int sum = 0;

			for (int j = 0; j < x[0].length; j++)
			{
				sum = sum + x[i][j];
			}
			System.out.println();
			System.out.print(sum);
		}
	}
}
