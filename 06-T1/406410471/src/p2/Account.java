package p2;

public class Account {
	
	String name;
	int money;
	
	public Account(String name, int money) {
		this.name=name;
		this.money=money;
	}

	public void deposit(int money) {
		this.money+=money;
	}

	public int getBalance() {
		return money;
	}

	public void withdraw(int money) {
		this.money-=money;
	}

}
