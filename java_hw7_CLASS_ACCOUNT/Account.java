package java_hw7_CLASS_ACCOUNT;

public class Account
{
	private String id, name, surname;
	private double balance;

	public Account(String id, String name, String surname, double balance)
	{
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.balance = balance;
	}

	public String getFullname()
	{
		return name + " " + surname;
	}

	public void setBalance(double amount)
	{
		balance = amount;
	}

	public double getBalance()
	{
		return balance;
	}

	public void deposit(double amount)
	{
		balance = balance + amount;
	}

	public void withdraw(double amount)
	{
		if (balance > amount)
		{
			balance = balance - amount;
		}
	}

	public static void transfer(Account source, Account destination, double amount)
	{
		if (source.getBalance() > amount)
		{
			source.withdraw(amount);
			System.out.println(source.getFullname());
			System.out.println(source.getBalance());
			
			destination.deposit(amount);
			System.out.println(destination.getFullname());
			System.out.println(destination.getBalance());
		} else {
			
			System.out.println(source.getFullname());
			System.out.println(source.getBalance());
			
			System.out.println(destination.getFullname());
			System.out.println(destination.getBalance());
		}
	}
}
