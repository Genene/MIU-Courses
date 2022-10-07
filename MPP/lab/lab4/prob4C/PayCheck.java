package lab4.probc;

public final class PayCheck {
	
	private double grossPay;
	private double fica_tax;
	private double state_tax;
	private double local_tax;
	private double medicare_tax;
	private double SSN;
	
	public PayCheck(double grossPay,Tax fica,Tax state_tax,Tax local_tax,Tax medicare_tax,Tax SSN )
	{
		this.grossPay=grossPay;
		this.fica_tax=fica.getVal();
		this.state_tax=state_tax.getVal();
		this.local_tax=local_tax.getVal();
		this.medicare_tax=medicare_tax.getVal();
		this.SSN=SSN.getVal();
	}
	
	public void print ()
	{
		System.out.println(toString());
	}
	
	
	@Override
	public String toString() {
		return "Paystub: \n "
				+ "  Gross Pay: " + grossPay + "\n"
				+ "  Fica: " + fica_tax  + "\n" 
				+ "  State: " + state_tax  + "\n" 
				+ "  Local: " + local_tax  + "\n" 
				+ "  Medicare: " + medicare_tax  + "\n" 
				+ "  Social Security: " + SSN  + "\n" 
				+ "  NET PAY: " + getNetPay();
	}

	
	public double getNetPay()
	{
		return grossPay-(grossPay*fica_tax+grossPay*state_tax
		        + grossPay * local_tax
		        + grossPay * medicare_tax
		        + grossPay * SSN);

	}
	

}
