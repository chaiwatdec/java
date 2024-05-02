package java_day12;

public class Cat extends Mammal
{
	double x, y;
	static double z; // share
	final double thisisconst;
	static final double thisisconststatic = Math.random() * 10;

	public Cat()
	{
		thisisconst = Math.random() * 10;
	}

	public String toString() // this method, it has got in every class by default
	{
		return String.format("x= %f, y= %f, z= %f", x, y, z);
	}

	public void say()
	{
		System.out.println(x + " meaw");
	}

	public static void xxx()
	{
		System.out.println("xxx");
	}
}
