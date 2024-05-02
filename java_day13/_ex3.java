package java_day13;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.*;
import java.util.Scanner;

public class _ex3
{
	public static void main(String[] args)
	{
		try
		{
			URL yahoo = new URL("http://rss.cnn.com/rss/edition.rss");
			BufferedReader in = new BufferedReader(new InputStreamReader(yahoo.openStream()));
			Scanner sc = new Scanner(in);

			while (sc.hasNext())
			{
				String s = sc.nextLine();
				System.out.println(s);
			}

			sc.close();

		} catch (MalformedURLException e)
		{
			e.printStackTrace();
		} catch (IOException e)
		{
			e.printStackTrace();
		}

	}
}
