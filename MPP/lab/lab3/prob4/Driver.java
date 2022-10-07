package lab3.prob4;

public class Driver {

	public static void main(String[] args) {

		Object[] objects = { new House(9000), new Condo(2), new Trailer(new Address("1100","fairfeild","IOWA","US")) };
		double totalRent = Admin.computeTotalRent(objects);
		System.out.println(totalRent);
	}
}
