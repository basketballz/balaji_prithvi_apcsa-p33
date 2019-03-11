//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class Discount
{
	//constructor
	public Discount()
	{
		bill = 0;
		finalbill = 0;	
	}
	
	public Discount(double a)
	{
		setBill(a);
		finalbill = 0;	
	}
			
	//instance variables
	private double bill, finalbill;
	
	//modifiers
	public void setBill(double a)
	{
		bill = a;
	}
	
	//accessor methods
	public double getFinalBill()
	{
		return finalbill;
	}

	
	//methods
	public void calcDiscountedFinalBill()
	{
		if (bill > 2000.0)
			finalbill = bill*0.85;
		else
			finalbill = bill;
	}

	//Events
	
	
/*	public static  double isDiscount( double bill )
	{
		return bill*0.85;
	}
	public static double notDiscount( double bill )
	{
		return bill;
	}	
*/
}

