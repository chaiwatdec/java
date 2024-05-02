package java_hw6_06_EF;

public class EF2
{
	public static void main(String[] args)
	{
		//pytaagorhus
		int a, b, c;
		int max = 500;

		for (a = 1; a < max; a++)
		{
			for (b = a; b < max; b++)
			{
				for (c = b; c < max; c++)
				{
					if ((Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c, 2))
					{
						System.out.println(a + ", " + b + ", " + c);
					}
				}
			}

		}
	}
}
