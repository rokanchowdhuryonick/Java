package account;

public class Account {
	private String accName, acid;
	private int balance;
	public Account() {
		//Default Constructor...
	}
	public Account(String accName, String acid, int balance) {
		this.accName = accName;
		this.acid = acid;
		this.balance = balance;
	}
	public void deposit(int amount) {
		this.balance = this.balance + amount;
	}
	public void Withdraw(int amount) {
		this.balance = this.balance - amount;
	}
	
}
