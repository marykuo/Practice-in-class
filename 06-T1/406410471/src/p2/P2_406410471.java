package p2;

public class P2_406410471 {

	public static void main(String[] args) {
		// 新開戶，帳號123456789，存進1000元
		System.out.println("Open a new account and deposit 1000 dollars");
		Account account = new Account("123456789", 1000);
		account.deposit(3000); // 存進 3000元
		System.out.println("Deposit 3000 dollars");
		System.out.println("Balance = " + account.getBalance());
		account.withdraw(2000); // 提領 2000元
		System.out.println("Withdraw 2000 dollars");
		System.out.println("Balance = " + account.getBalance());
	}
}

/*
Open a new account and deposit 1000 dollars
Deposit 3000 dollars
Balance = 4000
Withdraw 2000 dollars
Balance = 2000
*/