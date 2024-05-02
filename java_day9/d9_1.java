package java_day9;

import java.util.Scanner;

public class d9_1
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String names[] = new String[5];
		String surnames[] = new String[5];
		int score[] = new int[5];

		for (int i = 0; i < score.length; i++)
		{
			System.out.println("Enter Name, Surname and Score: ");
			names[i] = sc.nextLine();
			surnames[i] = sc.nextLine();
			score[i] = sc.nextInt();
			sc.nextLine();
		}

		String max_name = "", max_surname = "";
		int max_score = Integer.MIN_VALUE;
		for (int i = 0; i < score.length; i++)
		{
			if (score[i] > max_score)
			{
				max_score = score[i];
				max_name = names[i];
				max_surname = surnames[i];
			}
		}

		System.out.println();
		System.out.println(max_name);
		System.out.println(max_surname);
		System.out.println(max_score);
		sc.close();
	}

}
