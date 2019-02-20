//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class MultTens
{
	public static String go(  int x )
	{
		String cow ="";
		if (x <=0)
			return "aplus";
		int power = 10*x;
		for (int count=0 ; count<=power;count=count+10)
			if (count !=0)
			System.out.print(count);
		return cow;
		
	}
}