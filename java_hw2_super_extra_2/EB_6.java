package java_hw_super_extra_2;

public class EB_6
{

	public static void main(String[] args)
	{
		int i = 1;

		while (i <= 110)
		{

			if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0)
			{
				if (i % 11 == 0)
				{
					System.out.println("CozaLozaWoza");
				} else
				{
					System.out.print("CozaLozaWoza");
				}
			} else if (i % 5 == 0 && i % 7 == 0)
			{
				if (i % 11 == 0)
				{
					System.out.println("LozaWoza");
				} else
				{
					System.out.print("LozaWoza");
				}
			} else if (i % 3 == 0 && i % 7 == 0)
			{
				if (i % 11 == 0)
				{
					System.out.println("CozaWoza");
				} else
				{
					System.out.print("CozaWoza");
				}
			} else if (i % 3 == 0 && i % 5 == 0)
			{
				if (i % 11 == 0)
				{
					System.out.println("CozaLoza");
				} else
				{
					System.out.print("CozaLoza");
				}
			} else if (i % 7 == 0)
			{
				if (i % 11 == 0)
				{
					System.out.println("Woza");
				} else
				{
					System.out.print("Woza");
				}
			} else if (i % 5 == 0)
			{
				if (i % 11 == 0)
				{
					System.out.println("Loza");
				} else
				{
					System.out.print("Loza");
				}
			} else if (i % 3 == 0)
			{
				if (i % 11 == 0)
				{
					System.out.println("Coza");
				} else
				{
					System.out.print("Coza");
				}
			} else if (i % 11 == 0)
			{
				System.out.print(i);
				System.out.println();
			} else
			{
				System.out.print(i);
			}
			i++;
		}
	}
}
