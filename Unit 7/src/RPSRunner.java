//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response;
		do {
			
			System.out.print("Rock-Paper-Scissors - pick your weapon [r,p,s]:");
			RockPaperScissors test = new RockPaperScissors(keyboard.next());
			System.out.println(test);
			System.out.println(test.determineWinner()+"\n");
			System.out.print("Do you want to plY AGAIN?");
			response = keyboard.next().charAt(0);	
		}while(response=='Y'||response =='y');
		
		
	}
}
