package java_homework;

public class B10
{

	public static void main(String[] args)
	{
		for (int i = 1; i <= 1000; i = i + 1)
		{
			if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0)
			{

			} else if (i % 3 == 0 && i % 5 == 0)
			{
				System.out.println("3 5: " + i);
			} else if (i % 3 == 0 && i % 7 == 0)
			{
				System.out.println("3 7: " + i);
			} else if (i % 5 == 0 && i % 7 == 0)
			{
				System.out.println("5 7: " + i);
			}
		}

	}

}
