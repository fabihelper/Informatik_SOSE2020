package aufgabe3;

public class Circle extends Shape{

	int radius;
	double pi = Math.PI;
	String name = "Circle";
	
	public Circle(int r)
	{
		radius = r;
	}
	@Override
	public double getArea() {

		double area = radius * pi;
		return area;
		
	}

	@Override
	public String getName() {
		return name;
		
		
	}

}
