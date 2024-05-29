package java_hw8_Practice_Collection_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Ch4_3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		String inputDate = sc.nextLine();

		SimpleDateFormat inputFormat = new SimpleDateFormat("MM/dd/yyyy");
		SimpleDateFormat outputFormat = new SimpleDateFormat("dd MMM yyyy", Locale.ENGLISH);

		try
		{
			Date date = inputFormat.parse(inputDate);

			String formattedDate = outputFormat.format(date);
			
			formattedDate = formattedDate.toUpperCase();

			System.out.println(formattedDate);
		} catch (ParseException e)
		{
			System.out.println(e.getMessage());
		}

		sc.close();

	}
}