package entities;

public class Conta {
	private int accountNumber;
	private String accountName;
	private double balance;
	
	public Conta(int accountNumber, String accountName) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
	}
	
	public Conta(int accountNumber, String accountName, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		deposit(initialDeposit);
	}


	public int getAccountNumber() {
		return accountNumber;
	}
	
	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.00;
	}
	
	public String toString() {
		return "Account "
				+ accountNumber
				+ ", Holder: "
				+ accountName
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}
}
