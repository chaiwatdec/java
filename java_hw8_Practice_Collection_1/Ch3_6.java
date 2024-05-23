package java_hw8_Practice_Collection_1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ch3_6
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] numbers = new int[n];
		for (int i = 0; i < numbers.length; i++)
		{
			numbers[i] = sc.nextInt();
		}

		double mean = calculateMean(numbers);
		System.out.println(mean);

		double median = calculateMedian(numbers);
		System.out.println(median);

		int mode = calculateMode(numbers);
		System.out.println(mode == Integer.MIN_VALUE ? "No mode" : mode);

		sc.close();
	}

	public static double calculateMean(int[] numbers)
	{
		int sum = 0;
		for (int num : numbers)
		{
			sum += num;
		}
		return (double) sum / numbers.length;
	}

	public static double calculateMedian(int[] numbers)
	{
		Arrays.sort(numbers);
		if (numbers.length % 2 == 0)
		{
			return (numbers[numbers.length / 2 - 1] + numbers[numbers.length / 2]) / 2.0;
		} else
		{
			return numbers[numbers.length / 2];
		}
	}

	public static int calculateMode(int[] numbers)
	{
		Map<Integer, Integer> frequencyMap = new HashMap<>();
		for (int num : numbers)
		{
			frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
		}

		int mode = Integer.MIN_VALUE;
		int maxCount = 0;
		boolean multipleModes = false;

		for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet())
		{
			if (entry.getValue() > maxCount)
			{
				maxCount = entry.getValue();
				mode = entry.getKey();
				multipleModes = false;
			} else if (entry.getValue() == maxCount)
			{
				multipleModes = true;
			}
		}

		return multipleModes ? Integer.MIN_VALUE : mode;
	}
}
