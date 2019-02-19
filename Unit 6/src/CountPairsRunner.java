//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

import java.util.Scanner; 

public class CountPairsRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int i = 0;
		while (i < 11)
		{
			System.out.print("String please :: ");
			String stringone = keyboard.nextLine();
			System.out.println( CountPairs.pairCounter(stringone) );
			i++;
		}
		//add in all of the provided test cases from the lab handout	
	}
}