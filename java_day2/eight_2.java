package java_day2;

public class eight_2 {
    public static void main(String[] args) {
        int rows = 9; // Total rows
        int cols = (rows * 2) - 1; // Total columns

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (j <= i || j >= cols - 2 - i) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}

