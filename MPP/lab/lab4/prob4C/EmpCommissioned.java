package lab4.probc;

import java.time.LocalDate;
import java.util.List;

public class EmpCommissioned extends Employee{
	private double comission;
	private double baseSalary;
	private List<Order> orders;
	public EmpCommissioned(double empID, double comission, double baseSalary,List<Order> orders)
	{
		super(empID);
		this.comission=comission;
		this.baseSalary=baseSalary;
	}
	public double getComission() {
		return comission;
	}

	public double getBaseSalary() {
		return baseSalary;
	}
@Override
	public double calcGrossPay(int month, int year)
	{
	LocalDate firstOfCurrentMonth = LocalDate.of(year, month, 1);
	double orderAmountsThisMonth = 0.0;
	for(Order o: orders) {
		if(isPreviousMonth(firstOfCurrentMonth, o.getOrderDate())) {
			orderAmountsThisMonth += o.getOrderAmount();
		}
	}
	return baseSalary + comission * orderAmountsThisMonth;
}

private boolean isPreviousMonth(LocalDate current, LocalDate maybePrevious) {
	int currMonth = current.getMonthValue();
	int prevMonth = maybePrevious.getMonthValue();
	int currYear = current.getYear();
	int prevYear = maybePrevious.getYear();
	if((currMonth - prevMonth == 1 && currYear == prevYear) ||
			(currMonth == 1 && prevMonth == 12 && currYear - prevYear == 1)) {
		return true;
	}
	return false;
}
}

