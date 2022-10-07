package lab4.prob4E;
import java.util.List;

public class Admin {
	
	public static double computeUpdatedBalanceSum(List<Employee> list) {
		double totalBalance=0;
		for(Employee emp:list)
		{
			
			totalBalance=totalBalance+emp.computeUpdatedBalanceSum();
		}
		return totalBalance;
		
	}
}
