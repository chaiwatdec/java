package java_hw7_FUNC_MATRIX;

import java.util.Arrays;

public class _Test1
{
	public static void main(String[] args)
	{
		int order = 3;
		order = order - 1;

		int[] array3 =
		{ 1, 2, 3 };

		int[] array2 = new int[2];

		for (int i = order; i < array3.length - 1; i++)
		{
			array3[i] = array3[i + 1];
		}

		array3[array3.length - 1] = 0;

		for (int i = 0; i < array2.length; i++)
		{
			array2[i] = array3[i];
		}

		System.out.println(Arrays.toString(array2));
	}
}
