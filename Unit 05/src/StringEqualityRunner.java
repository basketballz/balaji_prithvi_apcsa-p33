//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

import java.util.Scanner;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		StringEquality cow = new StringEquality();
		out.println("Enter two strings ::");
		String wordOne = keyboard.nextLine();
		String wordTwo = keyboard.nextLine();
		cow.setWords(wordOne, wordTwo);
		cow.checkEquality();
		out.println(cow.toString());
		
		
	}
}








