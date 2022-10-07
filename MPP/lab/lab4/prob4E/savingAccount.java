package lab4.prob4E;

public class savingAccount extends Account{
	private double balance;
	private double interestRate;
	private String acctID;
	
	public savingAccount(String acctID,double interestRate,double balance)
	{
		this.balance=balance;
		this.interestRate=interestRate;
		this.acctID=acctID;
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
		double ComputedBalance=balance +(interestRate * balance);
		return ComputedBalance;
		
	}
	
	
	

}
