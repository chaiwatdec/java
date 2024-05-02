package java_hw7_CLASS_STUDENT;

import java.util.Scanner;

public class stdt2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int id = sc.nextInt();
		sc.nextLine();
		String name = sc.nextLine();
		String surname = sc.nextLine();
		String classroom = sc.nextLine();
		int score = Integer.parseInt(sc.nextLine());

		Student s1 = new Student(id, name, surname, classroom, score);

		System.out.println(s1.getGrade());

		sc.close();
	}
}
