package java_hw8_Practice_Collection_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Ch8_5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		// String fileName = sc.nextLine();

		String fileName = "C://java/NoonCh8_FindStudentGrade.txt";

		List<Student> students = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(fileName)))
		{
			String line;
			while ((line = br.readLine()) != null)
			{
				String[] parts = line.split(" ");
				String id = parts[0];
				int grade = Integer.parseInt(parts[1]);

				students.add(new Student(id, grade));
			}
		} catch (IOException e)
		{
			System.err.println(e.getMessage());
		}

		String stdid = sc.nextLine();

		boolean found = false;
		for (Student student : students)
		{
			if (student.id.equals(stdid))
			{
				System.out.println(student.grade);
				found = true;
				break; // Exit the loop once the student is found
			}
		}

		if (!found)
		{
			System.out.println("Not Found");
		}

		sc.close();
	}
}
