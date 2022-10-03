package bankingAccounts;



public class Account {

	private double balance;
	private String description;
	private int accountNbr;
	
	
	public Account(String description) {
		balance = 0.0;
		this.description = description;
		accountNbr = 0;
	}
	
	
	public boolean Deposit(double deposit) {
		
		balance += deposit;
		return true;
	}
	
	public boolean Withdraw(double withdraw) throws Exception {
		
		if(balance < withdraw) {
			throw new Exception("The withdraw amount exceeds the available balance.");
			
		}
		balance -= withdraw;
		return true;
	}
	
	public Boolean Transfer(double transfer, Account ToAccount) throws Exception {
		
		boolean approved = Withdraw(transfer);
		if(approved) {
			approved = ToAccount.Deposit(transfer);
		}
		return approved;
		
	}
	
	
	
	public double getBalance() {
		return balance;
	}
	public double setBalance(double xbalance) {
		return this.balance = xbalance;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getAccountNbr() {
		return accountNbr;
	}


	public void setAccountNbr(int accountNbr) {
		this.accountNbr = accountNbr;
	}
	
}
