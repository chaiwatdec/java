package java_hw_05_ED;

public class EH1
{
	public static void main(String[] args)
	{
		double a = 20000;

		double b = 500;
		int yr=0;
		while (b <= a)
		{
			b = b * 1.03;
			yr++;
		}

		System.out.println(yr);
	}
}
