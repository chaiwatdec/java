package java_day9;

public class d9_6_Vector
{
	public static void main(String args[])
	{

		// with vector2
		Vector2 a = new Vector2();
		Vector2 b = new Vector2(5, 7);
		a.x = 3;
		a.y = 4;

		// add
		Vector2 c;
		c = a.add(b);
		System.out.println("x " + c.x + "  y " + c.y);
		// System.out.println(c); // from method toString

		// sub
		Vector2 d;
		d = a.sub(b);
		System.out.println("x " + d.x + "  y " + d.y);
		// System.out.println(d); // from method toString

		// mul
		System.out.println(a.mul(5));

		// dot
		System.out.println(a.dot(b));

		// size
		System.out.println(a.size());

		// unit
		System.out.println(a.unit());
	}
}
