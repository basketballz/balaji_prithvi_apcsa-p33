//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringFirstLetterRunner
{
	public static void main( String args[] )
	{
		//add test cases
		StringFirstLetterCheck s = new StringFirstLetterCheck("hello","Hello");
		out.println(s);
		s = new StringFirstLetterCheck("hello","howdy");
		out.println(s);
		s = new StringFirstLetterCheck("fello","hoasdwdy");
		out.println(s);
		s = new StringFirstLetterCheck("hello","howasddy");
		out.println(s);
		s = new StringFirstLetterCheck("feasdllo","howasddy");
		out.println(s);
		s = new StringFirstLetterCheck("heslo","hoasdwdy");
		out.println(s);
		s = new StringFirstLetterCheck("felro","hoasdwdy");
		out.println(s);
		s = new StringFirstLetterCheck("helfdso","hoaswdy");
		out.println(s);
		s = new StringFirstLetterCheck("felasdlo","howdy");
		out.println(s);
		
	}
}