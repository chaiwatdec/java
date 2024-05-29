package java_hw8_Practice_Collection_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ch6_5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int amount = sc.nextInt();
		sc.nextLine();

		Doc[] docs = new Doc[amount];

		for (int i = 0; i < docs.length; i++)
		{
			String input = sc.nextLine();
			String[] parts = input.split(" ", 2);

			String docname = parts[0];
			String docdesp = parts.length > 1 ? parts[1] : "";

			docs[i] = new Doc(docname, docdesp);
		}

		String search = sc.nextLine();
		search = search.substring(4);

		ArrayList<String> searchResults = new ArrayList<>();

		for (int i = 0; i < docs.length; i++)
		{
			if (docs[i].docdesp.contains(search))
			{
				// System.out.println(docs[i].docname);
				searchResults.add(docs[i].docname);
			}
		}

		String[] x = new String[searchResults.size()];
		searchResults.toArray(x);

		System.out.println(Arrays.toString(x));

		for (int i = 0; i < searchResults.size(); i++)
		{
			// System.out.println(searchResults.get(i));
		}

		sc.close();

	}
}
