package java_day12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class d12_8_sort_City
{
	public static void main(String[] args)
	{
		Scanner sc = null;
		try
		{

			ArrayList<City> citys = new ArrayList<City>();
			int i = 0;
			sc = new Scanner(new File("C://java/world.csv"));

			while (sc.hasNext())
			{
				String s = sc.nextLine();
				String[] ss = s.split(";");
				City c = new City();
				// System.out.println(i);
				c.id = Integer.parseInt(ss[0].substring(1, ss[0].length() - 1)); // cut double quote by subtrring
				c.name = (ss[1].substring(1, ss[1].length() - 1));
				c.country = (ss[2].substring(1, ss[2].length() - 1));

				if (ss[3].equals("")) // if empty do nothing
				{
				} else
				{
					c.district = (ss[3].substring(1, ss[3].length() - 1));
				}
				c.population = Long.parseLong(ss[4].substring(1, ss[4].length() - 1));

				citys.add(c);
				i++;
				if (i >= 4000)
				{
					break;
				}
			}

			for (int j = 0; j < citys.size(); j++)
			{
				System.out.println(citys.get(j));
			}
		} catch (FileNotFoundException e)
		{
			e.printStackTrace();
		} finally
		{
			if (sc != null)
			{

			}
		}
	}
}
