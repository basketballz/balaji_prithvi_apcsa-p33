//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class StringRunner
{
	public static void main(String args[])
	{
		//"abc" "cba" "bca"
		//"one" "fourteen" "twenty"
		//"124323" "20009" "3434"
		//"abcde" "ABCDE" "1234234324"
			BiggestString test = new BiggestString();
			test.setStrings("abc", "cba", "bca");
			out.println(test);
			test.setStrings("one", "fourteen", "twenty");
			out.println(test);
			test.setStrings("124323", "20009", "3434");
			out.println(test);
			test.setStrings("abcde", "ABCDE", "1234234324");
			out.println(test);
			

	}
}