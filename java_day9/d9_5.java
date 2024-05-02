package java_day9;

public class d9_5
{
	public static void main(String[] args)
	{
		// Thread, anonymous inner class structure
		Thread t1 = new Thread(new Runnable()
		{
			public void run()
			{
				while (true)
				{
					try
					{
						Thread.sleep(150);
					} catch (Exception e)
					{
					}
					System.out.print("x");
				}
			}
		});
		t1.start();

		Thread t2 = new Thread(new Runnable()
		{
			public void run()
			{
				while (true)
				{
					try
					{
						Thread.sleep(100);
					} catch (Exception e)
					{
					}
					System.out.print("y");
				}
			}
		});
		t2.start();
	}
}
