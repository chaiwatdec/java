package java_day13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _ex2
{
	public static void main(String[] args) throws IOException
	{
		char ch = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("write character");
		while (ch != 'e')
		{
			ch = (char) br.read();
			System.out.println("you type: " + ch);
		}

		FileReader fr = new FileReader("test.txt");
		BufferedReader in=new BufferedReader(fr);
	}
}
