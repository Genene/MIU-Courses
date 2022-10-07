package lab3.prob2;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Apartment[] apts0 = {
				new Apartment(600),
				new Apartment(700)};
		Apartment[] apts1 = {
				new Apartment(500), 
				new Apartment(450)
		};
		Apartment[] apts2 = {
				new Apartment(1100),
				new Apartment(650)};
		
		Apartment[] apts3 = {
				new Apartment(6750), 
				new Apartment(945)
		};
		Building[] buildings = {
				new Building(150, Arrays.asList(apts0)),
				new Building(180, Arrays.asList(apts1)),
				new Building(200, Arrays.asList(apts2)),
				new Building(250, Arrays.asList(apts3))
		};
		
		LandlordInfo landlord = new LandlordInfo(Arrays.asList(buildings));
		for(Building b: buildings) {
			landlord.calcProfits();
		}
		System.out.println(landlord.calcProfits());
				
		}

	}



