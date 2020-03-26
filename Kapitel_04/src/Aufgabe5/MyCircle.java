package Aufgabe5;

public class MyCircle 
{
	double radius;
	double durchmesser;
	
	public MyCircle(double r)
	{
		setRadius(r);
		setDurchmesser(r);
	}
	
	public double berechneUmfang()
	{
		return 2*Math.PI*radius;
	}
	
	public double berechneFlaeche()
	{
		return Math.PI*radius*radius;
	}

	public double getRadius()
	{
		return radius;
	}
	
	public double getDurchmesser()
	{
		return durchmesser = 2*radius;
	}
	
	public void setRadius(double r)
	{
		radius = r;
	}
	
	public void setDurchmesser(double r)
	{
		durchmesser = 2*r;
	}

}
