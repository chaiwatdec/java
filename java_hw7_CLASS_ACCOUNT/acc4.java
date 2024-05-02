package java_hw7_CLASS_ACCOUNT;

import java.util.Scanner;

public class acc4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		String id = sc.nextLine();
		String name = sc.nextLine();
		String surname = sc.nextLine();
		double balance = Double.parseDouble(sc.nextLine());
		Account a1 = new Account(id, name, surname, balance);
		
		id = sc.nextLine();
		name = sc.nextLine();
		surname = sc.nextLine();
		balance = Double.parseDouble(sc.nextLine());
		Account a2 = new Account(id, name, surname, balance);

		double money = Double.parseDouble(sc.nextLine());

		Account.transfer(a1, a2, money);
		
		sc.close();
	}
}
