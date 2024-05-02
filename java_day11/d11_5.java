package java_day11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class d11_5
{
	public static void main(String[] args)
	{
		File f = new File("C://java/xxx.txt");
		FileOutputStream outs;
		PrintWriter pw;
		try
		{
			outs = new FileOutputStream(f, true); //
			pw = new PrintWriter(outs);
			pw.println("Hello");
			pw.close();

		} catch (FileNotFoundException e)
		{
			e.printStackTrace();

		}
	}
}
