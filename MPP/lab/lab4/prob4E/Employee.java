package lab4.prob4E;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private double sum=0;
	
	private List<Account>accts= new ArrayList();
	
	
	public String getName() {
		return name;
	}

	public Employee(String name)
	{
		this.name=name;
	}
	
	public void addAccount(Account act)
	{
		accts.add(act);
	}
	
	public double computeUpdatedBalanceSum() {
		
		for(Account aa:accts)
		{
			sum=sum+aa.computeUpdatedBalance();
		}
		
		return sum;
	}
	
	
}
