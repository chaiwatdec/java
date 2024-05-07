package java_hw7_APPLY_1;

public class Car
{
	public String model;
	public double fuel, speed, distanceTotal;

	public Car()
	{
	}

	public Car(String model, double fuel, double speed, double distanceTotal)
	{
		this.model = model;
		this.fuel = fuel;
		this.speed = speed;
		this.distanceTotal = distanceTotal;
	}

	public Car(String m)
	{
		// default fuel per vehicle
		fuel = Integer.parseInt(m.substring(1, 3));
		model = m;

		System.out.println("Create Car model " + m);
	}

	public void addFuel(double f)
	{
		fuel = fuel + f;
		// System.out.println("Add fuel " + f + " total " + fuel + " liter");
		System.out.printf("Add fuel %.2f total %.2f liter\n", f, fuel);
	}

	public void setSpeed(double s)
	{
		speed = s;
		System.out.printf("Set speed %.2f km/h\n", speed);
	}

	public double calculateDistance()
	{
		double maxdistance = 0;

		if (model.substring(0, 1).equals("A"))
		{
			if (speed >= 45 && speed <= 80)
			{
				maxdistance = fuel * 10;
			} else
			{
				maxdistance = fuel * 8;
			}
		} else if (model.substring(0, 1).equals("B"))
		{
			if (speed >= 45 && speed <= 80)
			{
				maxdistance = fuel * 12;
			} else
			{
				maxdistance = fuel * 10;
			}
		} else if (model.substring(0, 1).equals("C"))
		{
			if (speed >= 45 && speed <= 80)
			{
				maxdistance = fuel * 15;
			} else
			{
				maxdistance = fuel * 12;
			}
		} else if (model.substring(0, 1).equals("D"))
		{
			if (speed >= 45 && speed <= 80)
			{
				maxdistance = fuel * 20;
			} else
			{
				maxdistance = fuel * 16;
			}
		} else if (model.substring(0, 1).equals("E"))
		{
			if (speed >= 45 && speed <= 80)
			{
				maxdistance = fuel * 25;
			} else
			{
				maxdistance = fuel * 21;
			}
		}

		// System.out.printf("Max distance is %.2f km\n", maxdistance);
		return maxdistance;
	}

	public void startEngine(double d)
	{

		double caldist = calculateDistance();

		int addfuel = (int) Math.round(d - caldist);

		if (model.substring(0, 1).equals("A"))
		{
			if (speed >= 45 && speed <= 80)
			{
				addfuel = addfuel / 10;
			} else
			{
				addfuel = addfuel / 8;
			}
		} else if (model.substring(0, 1).equals("B"))
		{
			if (speed >= 45 && speed <= 80)
			{
				addfuel = addfuel / 12;
			} else
			{
				addfuel = addfuel / 10;
			}
		} else if (model.substring(0, 1).equals("C"))
		{
			if (speed >= 45 && speed <= 80)
			{
				addfuel = addfuel / 15;
			} else
			{
				addfuel = addfuel / 12;
			}
		} else if (model.substring(0, 1).equals("D"))
		{
			if (speed >= 45 && speed <= 80)
			{
				addfuel = addfuel / 20;
			} else
			{
				addfuel = addfuel / 16;
			}
		} else if (model.substring(0, 1).equals("E"))
		{
			if (speed >= 45 && speed <= 80)
			{
				addfuel = addfuel / 25;
			} else
			{
				addfuel = addfuel / 21;
			}
		}

		if (d > caldist)
		{
			System.out.println("Please add fuel " + (addfuel + 1) + " liter");

		} else if (d < caldist)
		{
			System.out.println("XXX " + (caldist - d));
		}
	}
}
