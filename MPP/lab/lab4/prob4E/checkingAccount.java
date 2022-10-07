package lab4.prob4E;

public class checkingAccount extends Account{
	private double balance;
	private double monthlyFee;
	private String acctID;
	
	public checkingAccount(String acctID,double monthlyFee,double balance) {
		this.acctID=acctID;
		this.monthlyFee = monthlyFee;
		this.balance = balance;
	}
	
	@Override
	public String getAccountID()
	{
		return acctID;
	}
	@Override
	public double getBalance()
	{
		return balance;
	}
	@Override
	public double computeUpdatedBalance()
	{
		return balance-monthlyFee;
	}
	
}
