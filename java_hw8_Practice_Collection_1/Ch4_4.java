package java_hw8_Practice_Collection_1;

import java.util.Scanner;

public class Ch4_4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		String binaryString = sc.nextLine();

		int countOfOnes = 0;

		for (int i = 0; i < binaryString.length(); i++)
		{
			if (binaryString.charAt(i) == '1')
			{
				countOfOnes++;
			}
		}

		String Parity;
		if (countOfOnes % 2 == 0)
		{
			Parity = "0";
		} else
		{
			Parity = "1";
		}

		System.out.println(binaryString + Parity);

		sc.close();
	}

}