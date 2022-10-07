package lab3.prob3a;

public class Circle extends Cylinder {
	private double radius;
	
	public Circle(double radius)
	{
		super(radius, radius);
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
