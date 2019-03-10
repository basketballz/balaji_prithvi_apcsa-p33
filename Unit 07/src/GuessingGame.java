//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Random;
import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
	private int upperBound, random, final1;

	public GuessingGame(int stop)
	{
		upperBound = stop;
		Random random1 = new Random();
		random = 1+random1.nextInt(upperBound);
	}

	public void playGame()
	{
		Scanner keyboard = new Scanner(System.in);
		int counter = 0;
		do {
			counter+=1;
			System.out.println("Enter a number between 1 and " +upperBound +" ");
		} while (keyboard.nextInt() != random);
		final1 = counter;
		
	}

	public String toString()
	{
		playGame();
		return "It took you " + final1 + " guesses to guess " + random +  ".";
	}
}