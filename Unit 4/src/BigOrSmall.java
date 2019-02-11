//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 
import java.util.Scanner;

public class BigOrSmall
{
	public static String check( int a, int b )
	{
		String c = "";
		if (a>b)
		c = "yes";
		if (b>a)
		c= "no";
		if (a==b)
		c = "aplus";
		
		return c;
				
	}
}