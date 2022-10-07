package lab3.prob2;

import java.util.ArrayList;
import java.util.List;

public class Building {
	
	private double maintCost;
	private List<Apartment> apartments= new ArrayList<Apartment>();
	
	public Building (double maintCost, List<Apartment>apartments)
	{
		this.maintCost=maintCost;
		this.apartments= apartments;
	}
	
	public double getMaintCost()
	{
		return maintCost;
	}
	
	public List<Apartment>getApartments()
	{
		return apartments;
	}
	
	public double CalculateBuildProfit()
	{
		double sumOfRent=0, profitOfBulding;
		for(Apartment a:apartments)
		{
			sumOfRent+=a.getRent();
		}
		profitOfBulding=sumOfRent-maintCost;
		return profitOfBulding;
		
	}
	

}
