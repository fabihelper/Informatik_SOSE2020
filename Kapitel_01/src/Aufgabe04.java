
public class Aufgabe04 
{
	public static void main(String[] args)
	{
		//printProducts(8);
		System.out.print(checkSum(235));
	}
	
	
	public static void printProducts(int n)
	{
		for(int spalte = 1; spalte <= n; ++ spalte)
		{			
			for(int zeile = 1; zeile <= n; ++zeile)
			{
				
				System.out.print(" "+ zeile*spalte+ " ");
			}
			
			System.out.println();
		}
		
	}
	
	public static int checkSum(int zahl)
	{
		
		if(zahl >= 10)
		{
			return zahl % 10 +checkSum(zahl/10);
		}
		else
		{
			return zahl;
		}
	}
	
}
