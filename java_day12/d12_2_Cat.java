package java_day12;

public class d12_2_Cat
{
	public static void main(String[] args)
	{
		Cat c = new Cat();
		Cat d = new Cat();

		c.x = 10;
		c.y = 11;
		c.z = 110; // call by object, z is share

		d.x = 19;
		d.y = 20;

		System.out.println("c " + c);
		System.out.println("d " + d);

		System.out.println();

		Cat.z = 200; // call by class

		System.out.println("c " + c);
		System.out.println("d " + d);
		System.out.println();

		c.say();
		d.say();

		Cat.xxx();

		System.out.println(c.thisisconst); // cannot change var thisisconst but value is random from class Cat
		System.err.println(d.thisisconst); // cannot change var thisisconst but value is random from class Cat
	}
}
