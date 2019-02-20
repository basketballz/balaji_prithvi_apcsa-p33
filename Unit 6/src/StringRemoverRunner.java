//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class StringRemoverRunner
{
	public static void main( String args[] )
	{
		StringRemover removernumber = new StringRemover("xR-MxR-MHelloxR-M", "R-M");
		out.println(removernumber);
		out.println(removernumber.removeStrings() + "\n");
		
		removernumber.setRemover("sxsssxssxsxssexssxsesss", " xs");
		out.println(removernumber);
		out.println(removernumber.removeStrings() + "\n");
		
		removernumber.setRemover("fuxqwexqwertyxqwexqwertyrtyxqwertyrtyn", " qwerty");
		out.println(removernumber);
		out.println(removernumber.removeStrings() + "\n");
		
											
	}
}