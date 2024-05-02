package java_hw_04_EA;

public class EA4217
{
	public static void main(String[] args) {
        int n = 9;

        for (int i = 0; i < n; i++) {
        	if (i%2==1) {
            for (int j = 0; j < 2 * n - 1; j++) {
                if (j < i || j >= 2 * n - 1 - i) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        	} else {
        		
        	}
        }
        
        for (int j=0; j<=(2*n)-2; j++)
        {
        	System.out.print("*");
        }
        System.out.println();
        for (int i = n - 2; i >= 0; i--) {
        	if (i%2==1) {
            for (int j = 0; j < 2 * n - 1; j++) {
                if (j < i || j >= 2 * n - 1 - i) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        	}else {
        		
        	}
        }
    }
}
