
//(c) A+ Computer Science
// www.apluscompsci.com


import static java.lang.System.*;

import java.util.Scanner;

public class TriplesRunnerexample
{
   public static void main(String args[])
   {
	   Scanner keyboard = new Scanner(in);
	   
	   out.println("Enter a number :: ");
	   int num = keyboard.nextInt();
	   
	   Triples run = new Triples(num);
	   
	   out.println(run);
   }
}