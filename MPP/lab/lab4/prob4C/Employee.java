package lab4.probc;

import java.time.LocalDate;

public abstract class Employee {
	private double empId;
	LocalDate current = LocalDate.now();
	
	public Employee(double empId)
	{
		this.empId=empId;
	}
	
	
	public void print()
	{
		System.out.println(calcCompensation(current.getMonthValue(), current.getYear()));
	}
	public PayCheck calcCompensation(int month,int year)
	{
		double gross=calcGrossPay(month,year);
		return new PayCheck(gross, Tax.FICA, Tax.State, 
				Tax.Local, Tax.Medicare, Tax.SSN);
	}
	
	public abstract double calcGrossPay(int month,int year);

}
