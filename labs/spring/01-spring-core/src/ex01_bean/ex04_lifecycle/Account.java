package ex01_bean.ex04_lifecycle;

public class Account {

	
	Account()
	{
		System.out.println("life cycle 1.. Account");
	}
	
	void deposit(float amt)
	{
		System.out.println("amount is" + amt);
	}
}
