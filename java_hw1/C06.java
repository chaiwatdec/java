package java_homework;

public class C06
{
	public static void main(String[] args)
	{

		int n = 9;

		for (int i = 0; i <= n; i++)
		{
			for (int j = 1; j <= 10 - i; j++)
			{
				System.out.print("-");
			}
			for (int k=1; k<=(i*2)+1;k++) {
				System.out.print(k);
			}
			System.out.println();
		}

	}
}
