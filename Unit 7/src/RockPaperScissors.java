//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		playChoice = compChoice= "";
	}

	public RockPaperScissors(String player)
	{
		int choice = (int)(Math.random()*3);
		switch(choice) {
		
		case 0 : compChoice = "R"; break;
		case 1 : compChoice = "R"; break;
		case 2 : compChoice = "R"; break;
		}
		playChoice = player;
	}

	public void setPlayers(String player)
	{
	}

	public String determineWinner()
	{
		String winner="";
		if (compChoice.equals(playChoice))
	{
			winner = "!Draw Game!";
		
	}
		else if (compChoice.equals("R"))
		{
			if (playChoice.equals("P"))
					{
			winner = "! Player wins <<Paper Covers Rock>>!";
		}
			else if (playChoice.equals("S"))
			{
				winner = "! Computer wins <<Rock Breaks Paper>>!";
			}
	}
	else if (compChoice.equals("P"))
	{
		if (playChoice.equals("S"))
		{
				winner = "! Player wins <<Scissors Cuts Paper>>!";
		}
		else if (playChoice.equals("R"))
		{
			winner = "! Computer wins <<Paper Covers Rocks>>!";
		}
	}
	else if (compChoice.equals("S"))
	{
		if (playChoice.equals("R"))
		{
				winner = "! Player wins <<Scissors Cuts Paper>>!";
		}
		else if (playChoice.equals("P"))
		{
			winner = "! Computer wins <<Paper Covers Rocks>>!";
		}
	}
}
	

	public String toString()
	{
		String output="";
		return output;
	}
}