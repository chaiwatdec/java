package java_hw5_05_EE;

public class EE3
{
	public static void main(String[] args)
	{
		for (int i = 2; i <= 12; i++)
		{
			System.out.println("**** " + i + " ****");
			for (int j = 1; j <= 12; j++)
			{
				System.out.println(i + " * " + j + " = " + i * j);
			}
		}
	}
}
