package java_hw8_Practice_Collection_1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ch3_5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		String firstString = sc.nextLine();
		String secondString = sc.nextLine();

		Set<Character> duplicates = findDuplicateCharacters(firstString, secondString);

		if (duplicates.isEmpty())
		{
			System.out.println("NONE");
		} else
		{
			// System.out.print("");
			for (char ch : duplicates)
			{
				System.out.print(ch + " ");
			}
			System.out.println();
		}

		sc.close();
	}

	public static Set<Character> findDuplicateCharacters(String first, String second)
	{
		Set<Character> firstSet = new HashSet<>();
		Set<Character> secondSet = new HashSet<>();
		Set<Character> duplicates = new HashSet<>();

		for (char ch : first.toCharArray())
		{
			firstSet.add(ch);
		}

		for (char ch : second.toCharArray())
		{
			secondSet.add(ch);
		}

		for (char ch : firstSet)
		{
			if (secondSet.contains(ch))
			{
				duplicates.add(ch);
			}
		}

		return duplicates;
	}
}
