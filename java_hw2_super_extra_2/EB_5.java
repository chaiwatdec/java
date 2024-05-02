package java_hw_super_extra_2;

import java.util.Scanner;

public class EB_5
{

	public static void main(String[] args) {
        int N;

        Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
        
        for (int i = N; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }

}
