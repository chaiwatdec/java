package java_hw7_CLASS_STUDENT;

import java.util.Scanner;

public class stdt3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		Student[] s = new Student[10];
		for (int i = 0; i < 10; i++)
		{
			int id = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			String surname = sc.nextLine();
			String classroom = sc.nextLine();
			int score = sc.nextInt();
			sc.nextLine();

			s[i] = new Student(id, name, surname, classroom, score);
		}

		System.out.println(Student.scoreAverage(s));

		sc.close();
	}
}
