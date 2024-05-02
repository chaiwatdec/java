package java_hw7_CLASS_ACCOUNT;

import java.util.Scanner;

public class acc1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		String id = sc.nextLine();
		String name = sc.nextLine();
		String surname = sc.nextLine();
		double balance = Double.parseDouble(sc.nextLine());

		Account a1 = new Account(id, name, surname, balance);

		System.out.println(a1.getFullname());
		System.out.println(a1.getBalance());
		a1.setBalance(100);
		System.out.println(a1.getBalance());

		sc.close();
	}
}
