//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
	{
	  
	   //char last = a.charAt(a.length()-1);
	   //char first = a.charAt(0);
	   String sf= a.substring(0,1);
	   String sl = a.substring(a.length()-1,a.length());
	   
	   String checkstring = "AEIOUaeiou";
		  if(checkstring.indexOf(sf) >= 0 || checkstring.indexOf(sl)>= 0)
			  return "yes";
		  else 
			  return "no";

	   //if(first == 'a' || first == 'e' ||first == 'i' || first == 'o' ||first == 'u' ||first == 'A' ||first == 'E' ||first == 'I' ||first == 'O' ||first == 'U' ||last == 'a' || last == 'e' ||last == 'i' || last == 'o' ||last == 'u' ||last == 'A' ||last == 'E' ||last == 'I' ||last == 'O' ||last == 'U' )
	   
	   //{
	   
		  // return "yes";
		   
	   //}
	   //else
		  // return "no";
		
	}
}
