package java_day12;

public class d12_3_Point
{
	public static void main(String[] args)
	{
		Point p1 = new Point(2, 4);
		Point p2 = new Point(12, 14);
		
		double a = Point.getDistance(p1, p2);
		
		System.out.println(a);
		
		
		Point3D p3 =new Point3D(3,4,5);
		System.out.println(p3.size_of_vector_to_this_point());
	}
}
