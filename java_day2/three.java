package java_day2;

public class three {

	public static void main(String[] args) {

		double g, l, T;

		l = 2.7;
		T = 3.298;

		g = 4 * Math.pow(Math.PI, 2) * l / (T * T);
		System.out.println(g);

		byte a = 4;
		byte b = 7;
		System.out.println(a & b);
		System.out.println(a | b);
		System.out.println(a ^ b);
		System.out.println(b >> 1);

	}

}
