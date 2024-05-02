package java_hw5_05_EE;

public class EE5
{
	public static void main(String[] args)
	{
		for (int i = 10000000; i > 0; i--)
		{
			int count = 0;
			for (int j = 1; j <= i; j++)
			{
				if (i % j == 0)
				{
					count++;
				}
			}

			if (count == 2)
			{				
				System.out.println(i);
				break;
			}
		}
	}
}
