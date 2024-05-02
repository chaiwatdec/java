package java_hw_super_extra_2;

public class EB_7
{

	public static void main(String[] args)
	{

		  System.out.print("*|");
	        for (int i = 1; i <= 9; i++) {
	            System.out.print("\t"+i);
	        }
	        System.out.println("\n-----------------------------------------------------------------------------");

			int k;
			for (int i = 1; i <= 9; i++)
			{
				System.out.print(i + "|");
				for (int j = 1; j <= 9; j++)
				{
					k = i * j;
					System.out.print("\t"+k);
				}

				System.out.println();
			}
	}
}
