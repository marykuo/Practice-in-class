package p2;

public class P2_406410471 {

	public static void main(String[] args) {
		// �s�}��A�b��123456789�A�s�i1000��
		System.out.println("Open a new account and deposit 1000 dollars");
		Account account = new Account("123456789", 1000);
		account.deposit(3000); // �s�i 3000��
		System.out.println("Deposit 3000 dollars");
		System.out.println("Balance = " + account.getBalance());
		account.withdraw(2000); // ���� 2000��
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