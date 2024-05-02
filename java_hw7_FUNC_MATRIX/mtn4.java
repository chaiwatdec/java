package java_hw7_FUNC_MATRIX;

import java.util.Scanner;

public class mtn4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		double[][] E = new double[N][N];
		
		for(int i = 0; i < N; i++)
		{
			for(int j = 0; j < N; j++)
			{
				E[i][j] = sc.nextDouble(); 
			}
		}
		
		MatrixN v1 = new MatrixN(N, E);

		
		double result = v1.det();
		System.out.println(result);
		
		sc.close();
	}
}