package java_day13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class d13_4_city_XXX
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter City: ");
		String cityName = sc.next().trim().toLowerCase();

		System.out.println("Enter Country: ");
		String countryName = sc.next().trim().toLowerCase();

		System.out.println("Enter Distance: ");
		double distance = sc.nextDouble();

		List<City> cities = new ArrayList<>();
		try (Scanner fileScanner = new Scanner(new BufferedReader(new FileReader("C://java/worldcitiespop.txt"))))
		{
			while (fileScanner.hasNextLine())
			{
				String line = fileScanner.nextLine();
				City city = parse(line);
				if (city.City.equalsIgnoreCase(cityName) && city.Country.equalsIgnoreCase(countryName))
				{
					cities.add(city);
				}
			}

			if (cities.isEmpty())
			{
				System.out.println("!!! City not found !!!");
				return;
			}

			for (City city : cities)
			{
				double dist = getDistance(city, cities.get(0)); // Assuming first matched city is selected
				if (dist <= distance)
				{
					System.out.println(city.City + ", " + city.Country + " - Distance: " + dist + " km");
				}
			}
		} catch (FileNotFoundException e)
		{
			System.err.println("File not found: " + e.getMessage());
		}
	}

	public static double getDistance(City c1, City c2)
	{
		double t1 = Math.toRadians(c1.Latitude);
		double t2 = Math.toRadians(c2.Latitude);
		double l1 = Math.toRadians(c1.Longtitude);
		double l2 = Math.toRadians(c2.Longtitude);

		double deltaT = t2 - t1;
		double deltaL = l2 - l1;

		double a = Math.pow(Math.sin(deltaT / 2), 2) + Math.cos(t1) * Math.cos(t2) * Math.pow(Math.sin(deltaL / 2), 2);
		double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

		return 6371 * c; // Radius of Earth in km
	}

	public static City parse(String line)
	{
		City city = new City();
		String[] parts = line.split(",");
		city.Country = parts[0];
		city.City = parts[1];
		city.AccentCity = parts[2];
		city.Region = parts[3];
		if (!parts[4].isEmpty())
		{
			city.Population = Long.parseLong(parts[4]);
		}
		city.Latitude = Double.parseDouble(parts[5]);
		city.Longtitude = Double.parseDouble(parts[6]);
		return city;
	}
}
