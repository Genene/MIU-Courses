package lab3.prob3a;

public class Cylinder {
	private double height;
	private double radius;
	
	public Cylinder (double height,double radius )
	{
		this.height=height;
		this.radius=radius;
	}
	
	public double getHeight()
	{
		return height;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public double ComputeVolume()
	{
		double volume= Math.PI*getRadius()*getRadius()*height;
		return volume;
	}

}
