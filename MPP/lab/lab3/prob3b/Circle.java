package lab3.prob3b;

public class Circle {
	private Cylinder cylinder;
	private double radius;
	
	public Circle(double radius)
	{
		cylinder= new Cylinder(radius, radius);
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public double computeArea()
	{
		double area=Math.PI*getRadius()*getRadius();
		return area;
	}
}
