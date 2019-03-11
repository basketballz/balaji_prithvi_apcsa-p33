//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		StringOddOrEven cow = new StringOddOrEven();
		for(int i=1;i<=4;i++)
		{out.println("enter a word: :");
		String s = keyboard.nextLine();
		
		cow.setString(s);
		
		if (cow.isEven() == true)
				out.println(cow.toString("even"));
			else
				out.println(cow.toString("odd"));
		}

	}
}