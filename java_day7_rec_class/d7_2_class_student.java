package java_day7_rec_class;

import java.util.Scanner;

public class d7_2_class_student
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		Student[] s = new Student[3];

		for (int i = 0; i < s.length; i++)
		{
			System.out.println("please enter name, surname and score " + i);
			s[i] = new Student();
			s[i].name = sc.nextLine();
			s[i].surname = sc.nextLine();
			s[i].score = sc.nextInt();
			//s[i].classroom = sc.nextInt();
			sc.nextLine();
		}

		Student max = s[0];
		for (int i = 0; i < s.length; i++)
		{
			if (max.score < s[i].score)
			{
				max = s[i];
			}
		}

		System.out.println(max.name + " " + max.surname + ": " + max.score);
		sc.close();
	}
}
