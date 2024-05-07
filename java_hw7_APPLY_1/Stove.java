package java_hw7_APPLY_1;

public class Stove
{
	public int isPlug, hasPan, time;
	public String mode;

	public Stove()
	{
		System.out.println("Create Electric Stove!");
	}

	public Stove(int isPlug, int hasPan, int time, String mode)
	{
		this.isPlug = isPlug;
		this.hasPan = hasPan;
		this.time = time;
		this.mode = mode;
	}

	public Stove(int p)
	{
		isPlug = p;

		if (p == 0)
		{
			System.out.println("Create Electric Stove!");
		} else
		{
			System.out.println("Create Electric Stove and put the plug in");
		}
	}

	public void unplug()
	{
		if (isPlug == 0)
		{
			System.out.println("Please plug in!");
		} else
		{
			System.out.println("Unplug a stove!");
		}
	}

	public void putPan(int p)
	{
		this.hasPan = p;

		if (p == 0)
		{
			System.out.println("Remove the pan from a Stove");
		} else
		{
			System.out.println("Put the pan on a Stove");
		}
	}

	public void setTime(int min, int sec)
	{

		if (isPlug == 0)
		{
			System.out.println("Please plug in!");
		} else if (min < 0)
		{
			System.out.println("Please set time!");
		} else
		{
			int minsec = min * 60;
			this.time = minsec + sec;
			System.out.println("Set time " + this.time + " seconds");
		}
	}

	public void selectMode(String mode)
	{
		this.mode = mode;

		if (isPlug == 0)
		{
			System.out.println("Please plug in!");
		} else
		{
			if (mode.equals("low") == true)
			{
				int elec = 500;
				System.out.println("Select " + mode + " mode " + elec + " watt");
			} else if (mode.equals("warm") == true)
			{
				int elec = 800;
				System.out.println("Select " + mode + " mode " + elec + " watt");
			} else if (mode.equals("steam") == true)
			{
				int elec = 1000;
				System.out.println("Select " + mode + " mode " + elec + " watt");
			} else if (mode.equals("boil") == true)
			{
				int elec = 1200;
				System.out.println("Select " + mode + " mode " + elec + " watt");
			} else if (mode.equals("fry") == true)
			{
				int elec = 1600;
				System.out.println("Select " + mode + " mode " + elec + " watt");
			} else
			{
				System.out.println("Wrong mode!");
				// System.out.println("Please select mode!");
			}
		}
	}

	public void cook()
	{
		int totalsec = this.time;

		if (isPlug == 0)
		{
			System.out.println("Please plug in!");
		} else if (totalsec == 0)
		{
			System.out.println("Please set time!");
		} else if (this.hasPan == 0)
		{
			System.out.println("Please put the pan to a stove!");
		} else
		{
			if ((mode.equals("low") == true) || (mode.equals("warm") == true) || (mode.equals("steam") == true)
					|| (mode.equals("boil") == true) || (mode.equals("fry") == true))
			{
				for (int min = totalsec / 60; min >= 0; min--)
				{
					for (int sec = totalsec % 60; sec >= 0; sec--)
					{
						System.out.printf("%04d:%02d\n", min, sec);
						totalsec--;
					}
				}
			} else
			{
				System.out.println("Please select mode!");
			}
		}
	}
}
