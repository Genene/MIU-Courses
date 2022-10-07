package lab4.probc;

public class EmpHourly extends Employee {
	private double hourlyWage;
	private int hoursPerWeek;
	private static final int Weeks_Per_month=4;
	
	public EmpHourly(double hourlyWage,int hoursPerWeek , double empID)
	{
		super(empID);
		this.hourlyWage=hourlyWage;
		this.hoursPerWeek=hoursPerWeek;
		
	}
	
	@Override
	public double calcGrossPay(int month, int year)
	{
		return hoursPerWeek*hourlyWage*Weeks_Per_month;
	}
	
	

}
