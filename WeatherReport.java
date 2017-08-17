package weather_report;

import java.util.Scanner;

public class Weather_report 
{

	public static void main(String[] args)
	{
		Scanner cin = new Scanner(System.in);
		
		int temp = cin.nextInt();
		
		double ans = (5*((double)temp-32))/9; 
		
		System.out.println("Welcome. Please enter your temperature in degrees F.");
		
		
		System.out.println("The temperature in your are is " + ans + " degrees C. Thank you very much have a nice day!");
		
		if(temp<=32)
		{
			System.out.println("Today it is cold outside.");
		}
		
		
		if(temp>=90)
		{
			System.out.println("Today it is hot outside.");
		}
		
		
		
		cin.close();
	}
	
	
}
