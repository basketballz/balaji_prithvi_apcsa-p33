//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter the original bill amount :: ");
		int amt = keyboard.nextInt();
		if (amt > 2000)
			{out.print("The final price is  ");
			out.printf("%.2f", Discount.isDiscount(amt) );}
		
		else
		{out.print("The final price is  ");
		out.printf("%.2f", Discount.notDiscount(amt) );}
		
		

	}
}