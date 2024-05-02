package java_hw7_FUNC_MATRIX;

import java.util.Arrays;

public class _Test2
{
	public static void main(String[] args)
	{
		int row = 3;
	    int col = 3;

	    row = row - 1;
	    col = col - 1;

	    int[][] array3 = {
	            {1, 2, 3},
	            {1, 2, 3},
	            {1, 2, 3}
	    };

	    int[][] array2 = new int[array3.length - 1][array3[0].length - 1];

	    int newRow = 0;
	    for (int i = 0; i < array3.length; i++) {
	        if (i == row) {
	            continue;
	        }

	        int newCol = 0;
	        for (int j = 0; j < array3[0].length; j++) {
	            if (j == col) {
	                continue;
	            }

	            array2[newRow][newCol] = array3[i][j];
	            newCol++;
	        }
	        newRow++;
	    }

	    for (int i = 0; i < array2.length; i++) {
	        for (int j = 0; j < array2[0].length; j++) {
	            System.out.print(array2[i][j] + "\t");
	        }
	        System.out.println();
	    }}
}
