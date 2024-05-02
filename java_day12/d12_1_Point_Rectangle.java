package java_day12;

public class d12_1_Point_Rectangle
{
	public static void main(String[] args)
	{
		Point p = new Point(3, 4);
		Rectangle r = new Rectangle(p, 100, 200);

		System.out.println(r);
		System.out.println("-----");

		r.width += 30;
		r.height += 30;

		System.out.println(r);
		System.out.println("-----");

		r.grow(20, 20);

		System.out.println(r);
		System.out.println("-----");

		r.move(-10, -10);

		System.out.println(r);
		System.out.println("-----");

		Point a = new Point();
		Point b = new Point();

		if (a == b)
		{
			System.out.println("yes");
		} else
		{
			System.out.println("no");
		}

		System.out.println(a == b);
		Point c = a;
		System.out.println("a==c : " + (a == c));
		System.out.println(a.equals(b));

		try
		{
			Point copy = (Point) a.clone();
			System.out.println("a = " + a);
			System.out.println("copy = " + copy);
			System.out.println("c = " + c);
			a.x = 100;
			System.out.println("a = " + a);
			System.out.println("copy = " + copy);
			System.out.println("c = " + c);
		} catch (CloneNotSupportedException e)
		{

		}

		System.out.println();
		try
		{
			Rectangle rr = r;
			Rectangle copy = (Rectangle) r.clone();
			System.out.println("r = " + r);
			System.out.println("copy = " + copy);
			System.out.println("rr = " + rr);
			r.corner.x = 55555;
			r.width = 66666;
			System.out.println("r = " + r);
			System.out.println("copy = " + copy);
			System.out.println("rr = " + rr);
		} catch (CloneNotSupportedException e)
		{

		}
	}
}
