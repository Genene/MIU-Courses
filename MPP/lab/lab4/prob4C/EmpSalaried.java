package lab4.probc;

public class EmpSalaried extends Employee {
	private double Gsalary;

	public EmpSalaried(double empID, double salary)
	{
		super(empID);
		this.Gsalary=salary;
	}
	
	@Override
	public double calcGrossPay(int month, int year)
	{
		return Gsalary;
	}

}
