package java_day9;

public class d9_3
{
	public static void main(String[] args)
	{
		// Vector test
		Vector a, b, c, d, e;
		a = new Vector();
		b = new Vector();

		a.x = 5;
		a.y = 6;
		b.x = 7;
		b.y = 8;

		c = a.add(b);
		d = a.sub(b);
		e = a.mul(b);

		System.out.println("add x: " + c.x + ", y: " + c.y);
		System.out.println("sub x: " + d.x + ", y: " + d.y);
		System.out.println("mul x: " + e.x + ", y: " + e.y);

	}
}
