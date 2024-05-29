package java_hw8_Practice_Collection_1;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Ch3_8
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		//String fileName = sc.nextLine();

		String fileName = "C://java/number1.txt";

		//String input = sc.nextLine();

		List<String> lines;
        try {
            lines = Files.readAllLines(Paths.get(fileName));
        } catch (IOException e) {
            System.err.println(e.getMessage());
            sc.close();
            return;
        }
		
        int[] numbers = new int[lines.size()];
        for (int i = 0; i < lines.size(); i++) {
            numbers[i] = Integer.parseInt(lines.get(i).trim());
        }
		
		System.out.println(Arrays.toString(numbers));

		
		int sum = sc.nextInt();

		int result = 0;
		for (int i = 0; i < numbers.length - 1; i++)
		{
			if (numbers[i] + numbers[i + 1] == sum)
			{
				result = i + 1;
				// System.out.println(i);
			}
		}

		System.out.println(result);

		sc.close();
	}
}
