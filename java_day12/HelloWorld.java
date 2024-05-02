package java_day12;

public class HelloWorld
{
	public int x;

	public HelloWorld(int y)
	{
		x = y;
	}

	public HelloWorld a()
	{
		return new HelloWorld(3);
	}

	public void copy(HelloWorld old)
	{
		this.x = old.x;
	}

	public static void main(String[] args)
	{
		HelloWorld y = new HelloWorld(7);
		System.out.println("+++" + y.a().x);
		
		HelloWorld x=new HelloWorld(3);
		x.copy(y);
		System.out.println(x.x);
		
	}
}
