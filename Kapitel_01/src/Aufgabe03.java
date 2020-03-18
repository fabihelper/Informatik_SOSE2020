
public class Aufgabe03 
{
	public static void main(String[] args)
	{
		/*System.out.println(addiere(1,2));
		System.out.println(subtrahiere(2,3));
		System.out.println(teile(3,4));
		System.out.println(multipliziere(4,5));
		
		
		System.out.println(multipliziere(5,addiere(1,2)));*/
		
		pyramide(8);
		
	}
	
	public static int addiere(int zahl1, int zahl2)
	{
		return zahl1+zahl2;
	}
	
	public static int subtrahiere(int zahl1, int zahl2)
	{
		return zahl1-zahl2;
	}
	
	public static int teile(int zahl1, int zahl2)
	{
		return zahl1/zahl2;
	}
	
	public static int multipliziere(int zahl1, int zahl2)
	{
		return zahl1*zahl2;
	}
	
	
	public static void pyramide(int hoehe)
	{
		int k=0;
		for(int i = 1; i <= hoehe; ++i)
		{
			for(int j = 1; j <= hoehe - i;++j)
			{
				System.out.print(" ");
			}
			
			
			for(; k!= (2*i-1);++k)
			{
				System.out.print("*");
			}
			k = 0;
			System.out.println();
		}
	}
	
}
