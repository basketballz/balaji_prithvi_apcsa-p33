//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class QuadraticRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int quadA;
		int quadB;
		int quadC;
		for(int i = 1; i<= 3; i++)
		{
		out.print("\nEnter the a :: ");
		 quadA = keyboard.nextInt();

		out.print("Enter the b :: ");
		 quadB = keyboard.nextInt();

		out.print("Enter the c :: ");
		 quadC = keyboard.nextInt();
		
		Quadratic test = new Quadratic(quadA,quadB,quadC);
		test.calcRoots();
		test.print();
		}
	
	}
}