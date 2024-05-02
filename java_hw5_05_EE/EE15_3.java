package java_hw5_05_EE;

public class EE15_3
{
	public static void main(String[] args)
	{
		int n = 4;

		for (int line = 1; line <= n; line++)
		{
			for (int j = 0; j <= n - line; j++)
			{
				System.out.print("\t");
			}

			int C = 1;
			for (int i = 1; i <= line; i++)
			{
				
				System.out.print(C + "\t\t");
				C = C * (line - i) / i;
			}
			System.out.println();
		}
	}
}
