package java_hw7_APPLY_1;

import java.util.Scanner;

public class std4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String type = sc.nextLine();
		String value = sc.nextLine();
		int n = Integer.parseInt(sc.nextLine());

		for(int i = 0; i < n; i++)
		{
			String txt = sc.nextLine();
			Student obj = new Student(txt);
			Student.add(obj);
		}
		
		Student.find(type,value);
		
		sc.close();
	}
}
