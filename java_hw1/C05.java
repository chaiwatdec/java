package java_homework;

public class C05
{

	public static void main(String[] args) {

		int n = 10;
		
		for (int j = 1; j <= n; j++) {
			for (int i = 1; i <= n ; i++) {
				if (i >= n - j +1) {
					System.out.print("x");
				} else {
					System.out.print("-");
				}
			}
			System.out.println("");
		}
	}

}
