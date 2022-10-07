package lab3.prob2;

import java.util.ArrayList;
import java.util.List;

public class LandlordInfo {
	private List<Building> buildings = new ArrayList<Building>();
	
	public LandlordInfo(List<Building>buildings)
	{
		this.buildings=buildings;
	}
	
	public double calcProfits()
	{
		double profitOfBuildings=0;
		for(Building build:buildings)
		{
			profitOfBuildings+=build.CalculateBuildProfit();
		}
		
		return profitOfBuildings;
	}

}
