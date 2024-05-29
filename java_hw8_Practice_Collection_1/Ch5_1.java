package java_hw8_Practice_Collection_1;

import java.util.Scanner;

public class Ch5_1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		String word = sc.nextLine();

		System.out.print(count(word, "0") + " " + count(word, "1") + " " + count(word, "2") + " " + count(word, "3")
				+ " " + count(word, "4") + " " + count(word, "5") + " " + count(word, "6") + " " + count(word, "7")
				+ " " + count(word, "8") + " " + count(word, "9") + " ");
		System.out.print(count(word, "A") + " " + count(word, "B") + " " + count(word, "C") + " " + count(word, "D")
				+ " " + count(word, "E") + " " + count(word, "F") + " " + count(word, "G") + " " + count(word, "H")
				+ " " + count(word, "I") + " " + count(word, "J") + " " + count(word, "K") + " " + count(word, "L")
				+ " " + count(word, "M") + " " + count(word, "N") + " " + count(word, "O") + " " + count(word, "P")
				+ " " + count(word, "Q") + " " + count(word, "R") + " " + count(word, "S") + " " + count(word, "T")
				+ " " + count(word, "U") + " " + count(word, "V") + " " + count(word, "W") + " " + count(word, "X")
				+ " " + count(word, "Y") + " " + count(word, "Z") + " ");
		System.out.println(count(word, "a") + " " + count(word, "b") + " " + count(word, "c") + " " + count(word, "d")
				+ " " + count(word, "e") + " " + count(word, "f") + " " + count(word, "g") + " " + count(word, "h")
				+ " " + count(word, "i") + " " + count(word, "j") + " " + count(word, "k") + " " + count(word, "l")
				+ " " + count(word, "m") + " " + count(word, "n") + " " + count(word, "o") + " " + count(word, "p")
				+ " " + count(word, "q") + " " + count(word, "r") + " " + count(word, "s") + " " + count(word, "t")
				+ " " + count(word, "u") + " " + count(word, "v") + " " + count(word, "w") + " " + count(word, "x")
				+ " " + count(word, "y") + " " + count(word, "z"));
		sc.close();
	}

	public static int count(String word, String s)
	{
		char Char = s.charAt(0);
		int countstring = 0;

		for (int i = 0; i < word.length(); i++)
		{
			if (word.charAt(i) == Char)
			{
				countstring++;
			}
		}
		return countstring;
	}
}
