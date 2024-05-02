package java_day2;

public class two {

	public static void main(String[] args) {

		double g, G, m2, R;
		G = 6.67e-11;
		m2 = 5.974E24;
		R = 6371E3;
		g = G * m2 / (R * R);
		System.out.println(g);
	}

}
