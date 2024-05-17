package java_hw8_Practice_Collection_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ch1_2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String fileName = sc.nextLine();

		//String fileName = "C://java/NoonCh1_AnalyzeScore2.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(fileName)))
		{
			String line;
			while ((line = br.readLine()) != null)
			{
				String[] parts = line.split(" ");
				String id = parts[0];

				double score = 0;

				for (int i = 1; i < parts.length; i++)
				{
					score = score + Double.parseDouble(parts[i]);
				}

				String grade = calGrade(score);

				System.out.println(id + " " + grade);
			}
		} catch (IOException e)
		{
			System.err.println(e.getMessage());
		}

		sc.close();
	}

	public static String calGrade(double score)
	{
		if (score >= 80 & score <= 100)
		{
			return "A";
		} else if (score >= 75)
		{
			return "B+";
		} else if (score >= 70)
		{
			return "B";
		} else if (score >= 65)
		{
			return "C+";
		} else if (score >= 60)
		{
			return "C";
		} else if (score >= 55)
		{
			return "D+";
		} else if (score >= 50)
		{
			return "D";
		} else
		{
			return "F";
		}
	}

}
