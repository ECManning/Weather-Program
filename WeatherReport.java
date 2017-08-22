package weather_report;

import java.util.Scanner;

public class Weather_report 
{

	public static void main(String[] args)
	{
		Scanner cin = new Scanner(System.in);
		
		int temp = cin.nextInt();
		
		double ans = (5*((double)temp-32))/9; //this is the formula for getting the temp in degrees C
		
		System.out.println("Welcome. Please enter your temperature in degrees F."); //this declares what the program first says 
		
		
		System.out.println("The temperature in your are is " + ans + " degrees C. Thank you very much have a nice day!"); //this is what it says when it presents you the answer
		
		if(temp<=32) //if the temp is this cool then
		{
			System.out.println("Today it is cold outside."); //the system prints out this message
		}
		
		
		if(temp>=90) // if it is this hot then
		{
			System.out.println("Today it is hot outside."); //itll print out this message
		}
		
		
		
		cin.close();
	}
	
	
}
