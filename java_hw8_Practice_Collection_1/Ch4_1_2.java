package java_hw8_Practice_Collection_1;

import java.util.Arrays;
import java.util.Scanner;

public class Ch4_1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of strings
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character after the integer input

        // Read each string
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = sc.nextLine();
        }

        // Sort the strings by first character and then by length using bubble sort
        int count = bubbleSort(strings);

        // Output the sorted strings
        System.out.println(Arrays.toString(strings));
        System.out.println("Total swaps: " + count);
        
        sc.close();
    }

    // Bubble sort to sort strings by first character and then by length
    public static int bubbleSort(String[] arr) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // First, sort by first character
                if (arr[j].charAt(0) > arr[j + 1].charAt(0)) {
                    swap(arr, j, j + 1);
                    count++;
                }
                // If first characters are equal, then sort by length
                else if (arr[j].charAt(0) == arr[j + 1].charAt(0) && arr[j].length() > arr[j + 1].length()) {
                    swap(arr, j, j + 1);
                    count++;
                }
            }
        }
        return count;
    }

    // Helper method to swap elements in an array
    private static void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
}
