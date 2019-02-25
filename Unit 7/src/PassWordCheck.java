//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

class PasswordCheck
{
	private String password;

	public PasswordCheck()
	{
		password = "123";
	}

	public void check()
	{
		Scanner keyboard = new Scanner(System.in);
		String s;
		do {
			out.println("Enter a password!");
			s = keyboard.nextLine();
			
			
			
		}while(!s.equals(password));
		
		
	}
}