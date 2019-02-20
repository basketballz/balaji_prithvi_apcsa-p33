
//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

import java.util.Scanner;

public class WordRunner
{
	public static void main ( String[] args )
	{
		Word wr = new Word();
		
		wr.setString("Hello");
		System.out.println(wr+"\n");
		
		wr.setString("World");
		System.out.println(wr+"\n");
		
		wr.setString("JukeBox");
		System.out.println(wr+"\n");
		
		wr.setString("TCEA");
		System.out.println(wr+"\n");
		
		wr.setString("UIL");
		System.out.println(wr+"\n");

	}
}