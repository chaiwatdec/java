package java_hw7_APPLY_1;

public class RiceCooker
{
	public int rice, water;
	public String mode;

	public RiceCooker()
	{
		System.out.println("Create Rice Cooker!");
	}

	public RiceCooker(int rice, int water, String mode)
	{
		this.rice = rice;
		this.water = water;
		this.mode = mode;
	}

	public void addRice(int r)
	{
		rice = r;
		System.out.println("Add the rice " + r + " g");
	}

	public void addWater(int w)
	{
		water = w;
		System.out.println("Add the water " + w + " g");
	}

	public int getRice()
	{
		return rice;
	}

	public int getWater()
	{
		return water;
	}

	public void selectMode(String mode)
	{
		this.mode = mode;

		if (rice == 0 && water == 0)
		{
			System.out.println("Please add rice and water");
		} else if (rice == 0 && water > 0)
		{
			System.out.println("Please add rice");
		} else if (rice > 0 && water == 0)
		{
			System.out.println("Please add water");
		} else if (mode.equals("white") == true)
		{
			if ((double) water / (double) rice == 1.25)
			{
				System.out.println("Good, this is white mode");
			} else
			{
				System.out.println("Ratio not correct, the water should be");
				System.out.println((double) rice * 1.25);
			}

		} else if (mode.equals("brown") == true)
		{
			if ((double) water / (double) rice == 2)
			{
				System.out.println("Good, this is brown mode");
			} else
			{
				System.out.println("Ratio not correct, the water should be");
				System.out.println((double) rice * 2);
			}
		} else if (mode.equals("sticky") == true)
		{
			if ((double) water / (double) rice == 1)
			{
				System.out.println("Good, this is sticky mode");
			} else
			{
				System.out.println("Ratio not correct, the water should be");
				System.out.println((double) rice * 1);
			}
		} else if (mode.equals("japanese") == true)
		{
			if ((double) water / (double) rice == 1.2)
			{
				System.out.println("Good, this is japanese mode");
			} else
			{
				System.out.println("Ratio not correct, the water should be");
				System.out.println((double) rice * 1.2);
			}
		} else if (mode.equals("mixed") == true)
		{
			if ((double) water / (double) rice == 1.5)
			{
				System.out.println("Good, this is mixed mode");
			} else
			{
				System.out.println("Ratio not correct, the water should be");
				System.out.println((double) rice * 1.5);
			}
		}
	}

	public void cook()
	{
		if (rice == 0 && water == 0)
		{
			System.out.println("Cannot cook");
		} else if (rice == 0 && water > 0)
		{
			System.out.println("Cannot cook");
		} else if (rice > 0 && water == 0)
		{
			System.out.println("Cannot cook");
		} else if (mode.equals("white") == true)
		{
			if ((double) water / (double) rice == 1.25)
			{
				for (int i = 35; i >= 0; i--)
				{
					System.out.println(i);
				}
			} else
			{
				System.out.println("Cannot cook");
			}

		} else if (mode.equals("brown") == true)
		{
			if ((double) water / (double) rice == 2)
			{
				for (int i = 50; i >= 0; i--)
				{
					System.out.println(i);
				}
			} else
			{
				System.out.println("Cannot cook");
			}
		} else if (mode.equals("sticky") == true)
		{
			if ((double) water / (double) rice == 1)
			{
				for (int i = 55; i >= 0; i--)
				{
					System.out.println(i);
				}
			} else
			{
				System.out.println("Cannot cook");
			}
		} else if (mode.equals("japanese") == true)
		{
			if ((double) water / (double) rice == 1.2)
			{
				for (int i = 45; i >= 0; i--)
				{
					System.out.println(i);
				}
			} else
			{
				System.out.println("Cannot cook");
			}
		} else if (mode.equals("mixed") == true)
		{
			if ((double) water / (double) rice == 1.5)
			{
				for (int i = 60; i >= 0; i--)
				{
					System.out.println(i);
				}
			} else
			{
				System.out.println("Cannot cook");
			}
		}
	}

	public void cookWithTimer(int hour)
	{
		if (rice == 0 && water == 0)
		{
			cook();
		} else if (rice == 0 && water > 0)
		{
			cook();
		} else if (rice > 0 && water == 0)
		{
			cook();
		} else if (mode.equals("white") == true)
		{
			if ((double) water / (double) rice == 1.25)
			{
				for (int i = hour; i >= 0; i--)
				{
					System.out.println(i);
				}
				System.out.println("start cook");
				cook();
			} else
			{
				cook();
			}

		} else if (mode.equals("brown") == true)
		{
			if ((double) water / (double) rice == 2)
			{
				for (int i = hour; i >= 0; i--)
				{
					System.out.println(i);
				}
				System.out.println("start cook");
				cook();
			} else
			{
				cook();
			}
		} else if (mode.equals("sticky") == true)
		{
			if ((double) water / (double) rice == 1)
			{
				for (int i = hour; i >= 0; i--)
				{
					System.out.println(i);
				}
				System.out.println("start cook");
				cook();
			} else
			{
				cook();
			}
		} else if (mode.equals("japanese") == true)
		{
			if ((double) water / (double) rice == 1.2)
			{
				for (int i = hour; i >= 0; i--)
				{
					System.out.println(i);
				}
				System.out.println("start cook");
				cook();
			} else
			{
				cook();
			}
		} else if (mode.equals("mixed") == true)
		{
			if ((double) water / (double) rice == 1.5)
			{
				for (int i = hour; i >= 0; i--)
				{
					System.out.println(i);
				}
				System.out.println("start cook");
				cook();
			} else
			{
				cook();
			}
		}
	}
}
