//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

class StringRemover
{
   private String sentence;
   private String remove;

	//add in constructors
   
   public  StringRemover()
	{
	   sentence = "";
	   remove = "";
	}
   
   
   public  StringRemover(String s , String rem)
  	{
	   sentence = "";
	   remove = "";
	   setRemover(s,rem);
  	}


	

	public void setRemover(String s, String rem)
	{
		sentence =s;
		remove=rem;
	}

	public String removeStrings()
	{
		String cleaning = sentence;
		int loc = cleaning.indexOf(remove);
		while(loc>-1)
		{
			
			cleaning = cleaning.substring(0,loc-1)+ cleaning.substring(loc+remove.length());
			loc = cleaning.indexOf(remove);
			
			
		}
		return cleaning;
		
	}

	public String toString()
	{
		return sentence + " - String to remove " +remove;
	}
}