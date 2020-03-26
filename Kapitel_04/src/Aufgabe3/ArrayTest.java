package Aufgabe3;

import java.util.Random;

public class ArrayTest 
{
	public static void main(String[] args)
	{
		int temp;
		int array[] = new int[10];
		Random generator = new Random();
		
		for(int i = 0; i <= 9; ++i)
		{
			array[i] = generator.nextInt(100); 
		}
		
		for(int i = 0; i <= 9; ++i)
		{
			System.out.println(array[i]);
		}
		
		System.out.println("------------------------------------------------------------");
		
		for(int i = 1; i < array.length ;++i)
		{
			for(int j = 0; j < array.length-i; ++j)
			{
				if(array[j] > array[j+1])
				{
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					
				}
			}
			

		}
		
		for(int i = 0; i <= 9; ++i)
		{
			System.out.println(array[i]);
		}
		
		System.out.println("------------------------------------------------------------");
		System.out.println(array[0] + " und "+ array[array.length-1]);
		
	}
}
