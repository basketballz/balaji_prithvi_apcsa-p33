//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class BiggestString
{
	private String one,two,three;

	public BiggestString()
	{
		this("","","");
	}

	public BiggestString(String a, String b, String c)
	{
		setStrings(a,b,c);
	}

	public void setStrings(String a, String b, String c)
	{
		one=a;
		two=b;
		three=c;
	}

	public String getBiggest()
	{
		String s = "";
		if (one.compareTo(two)>0 && one.compareTo(three)>0)
		{
		
				s=one;
			
		}
		if (two.compareTo(one)>0 && two.compareTo(three)>0)
		{
			
				s=two;
			
		}
		if (three.compareTo(two)>0 && three.compareTo(one)>0 )
		{
			
				s=three;
			
		}
	
				
				
				
		
		return s;
	}

	public String toString()
	{
	   return "biggest = "+getBiggest() +"\n";
	}
}