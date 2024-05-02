package java_day2;

public class seven_2 {

	public static void main(String[] args) {

		int n = 10;
		
		for (int j = 1; j <= n; j++) 
		{
			for (int i = 1; i <= n * 2; i++) 
			{
				if (i >= j && i <= 2 * n - j) 
				{
					System.out.print("x");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}

}
