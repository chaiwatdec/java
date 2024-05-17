package java_hw8_Practice_Collection_1;

import java.util.Scanner;

public class Ch2_5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();


        int[] digitCounts = new int[10];

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                digitCounts[ch - '0']++;
            }
        }

        for (int i = 0; i < digitCounts.length; i++) {
            System.out.println("Count of " + i + " = " + digitCounts[i]);
        }

		sc.close();

	}
}
