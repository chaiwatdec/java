package java_hw5_05_EE;

public class EE6_1
{

	public static void main(String[] args)
	{
		
	        double epsilon = 0.000001; // Desired precision
	        double approximation = 0.0;
	        double pi = Math.PI;
	        int n = 1;

	        while (Math.abs(pi - approximation) > epsilon) {
	            approximation += (Math.pow(-1, n + 1) * 4.0) / (2 * n - 1);
	            n++;
	        }

	        System.out.println("Approximation of π: " + approximation);
	        System.out.println("Number of terms used: " + n);
	    }
	}


