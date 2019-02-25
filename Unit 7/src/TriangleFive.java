//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import java.util.Scanner;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		setAmount(0);
		setLetter(' ');
	}

	public TriangleFive(char c, int amt)
	{
		setAmount(amt);
		setLetter(c);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{	
		
	    String s = "";
		char y = ' ';
		int cow = 0;
		int cow1=0;
		
		
		for (int i = 1; i <= amount; i++)   //ROW
		{	
			
			for (int j = amount; j >= i; j--) //COLUMN
			{
				
					y = (char) (letter + (char) (amount - j)); 
					cow = (int)y;
					if(cow<65 || cow>90)
								{cow = 65+cow1;
								y = (char)cow; }
				
				
				
				for (int k = 1; k <= j; k++) //CHAR PRINT IN EACH ROWXCOL
				{
					
					s = s + y;
				}
				if (y == 'A')
				{cow1 +=1; }
				s = s + " ";
				
				
				
							
				
			}
			s=s+"\n";
			cow1=0;
			
					
		}	
		
	

		
		return s;
	}
}