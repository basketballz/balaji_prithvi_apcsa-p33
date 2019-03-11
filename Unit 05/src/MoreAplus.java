//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class MoreAplus
{
   public static String go( String a )
	{
	   int now = a.indexOf("aplus");
	   int count = 0;
	   while (now != -1) {
		   a = a.substring(now+1);
		   count++;
		   now = a.indexOf("aplus");
	   }
	   return (count > 1 ? "yes" : "no");
	}
}