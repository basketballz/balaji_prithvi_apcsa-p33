//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		setRemover("", ' ');
	}

	//add in second constructor
	public LetterRemover(String cow, char se)
	{
		setRemover(cow,se);
	}
	
	
	public void setRemover(String cow, char se)
	{
		sentence = cow;
		lookFor = se;
	}

	public String removeLetters()
	{
		String cleaned=sentence;
		int loc = cleaned.indexOf(lookFor);
		while(loc>-1)
		{
			cleaned = cleaned.substring(0,loc) + cleaned.substring(loc+1);
			loc = cleaned.indexOf(lookFor);
		}
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor+ "\n" + removeLetters()+"\n";
	}
}