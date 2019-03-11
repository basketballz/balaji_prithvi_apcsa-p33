//(c) A+ Computer Science
// www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Quadratic
{
	private int a, b, c;
	private double rootOne;
	private double rootTwo;

	public Quadratic()
	{
		setEquation(a,b,c);
		rootOne = 0.0;
		rootTwo = 0.0;
	}

	public Quadratic(int quadA, int quadB, int quadC)
	{
		setEquation(quadA, quadB, quadC);
		rootOne = 0.0;
		rootTwo = 0.0;
		
	}

	public void setEquation(int quadA, int quadB, int quadC)
	{
		a = quadA;
		b = quadB;
		c = quadC;
		
	}

	public void calcRoots( )
	{
		rootOne =  (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		rootTwo =  (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
 	}
	
    public void print()
    {
    	System.out.printf("%.2f\n",rootOne);
    	System.out.printf("%.2f\n",rootTwo);
    	
    }
    
    //complete either print or the toString()

	//public String toString()
	{
	//	return "";
	}
}