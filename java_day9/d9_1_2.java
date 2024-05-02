package java_day9;

import java.util.Scanner;

public class d9_1_2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Student[] s = new Student[10];

		for (int i = 0; i < s.length; i++)
		{
			//s[i] = new Student();
			System.out.println("Enter Name, Surname and Score: ");
			s[i].name = sc.nextLine();
			s[i].surname = sc.nextLine();
			s[i].score = sc.nextInt();
			sc.nextLine();
		}

		Student max = new Student();
		max.score = Integer.MIN_VALUE;
		for (int i = 0; i < s.length; i++)
		{
			if (s[i].score > max.score)
			{
				max = s[i];
			}
		}

		System.out.println();
		System.out.println(max.name + " " + max.surname + " : " + max.score);

		sc.close();

	}
}
