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
		
		
/*		for(int i=1;i<=4;i++)
		{
			out.println();
			out.print("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();
		if (amt > 2000)
			{out.print("The final price is  ");
			out.printf("%.2f", Discount.isDiscount(amt) );}
		
		else
		{out.print("The final price is  ");
		out.printf("%.2f", Discount.notDiscount(amt) );}}
*/		
		
		Discount cow = new Discount();
		double amt;
		
		for(int i=1;i<=4;i++)
		{
			out.println();
			out.print("Enter the original bill amount :: ");
			amt = keyboard.nextDouble();
		
			cow.setBill(amt);
			cow.calcDiscountedFinalBill();
			
			out.println(cow.getFinalBill());
	
		}
			
			//{out.print("The final price is  ");
			//out.printf("%.2f", Discount.isDiscount(amt) );}
		
//		else
	//	{out.print("The final price is  ");
		//out.printf("%.2f", Discount.notDiscount(amt) );}}

	}
}
	