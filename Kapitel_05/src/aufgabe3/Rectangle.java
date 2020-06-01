package aufgabe3;

public class Rectangle extends Shape{

	int laenge;
	int breite;
	String name = "rectangle";
	public Rectangle(int l, int b)
	{
		 laenge = l;
		 breite = b;
	}
	@Override
	public double getArea() {
		
		return laenge*breite;
	}

	@Override
	public String getName() {
		return name;
		
	}

	
}
