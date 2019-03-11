//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import java.util.Scanner;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		LetterRemover letmove = new LetterRemover();
		
		letmove.setRemover("I am Sam I am", 'a');
		System.out.println(letmove.toString());
		System.out.println(letmove.removeLetters()+"\n");
		
		
		letmove.setRemover("ssssssssxssssesssssesss", 's');
		System.out.println(letmove.toString());
		System.out.println(letmove.removeLetters()+"\n");
		
		
		letmove.setRemover("qwertyqwertyqwerty", 'a');
		System.out.println(letmove.toString());
		System.out.println(letmove.removeLetters()+"\n");
		
		
		
		letmove.setRemover("abababababa", 'b');
		System.out.println(letmove.toString());
		System.out.println(letmove.removeLetters()+"\n");
		
		
		
		letmove.setRemover("abaababababa", 'x');
		System.out.println(letmove.toString());
		System.out.println(letmove.removeLetters()+"\n");
		
	
		
		
		
		
											
	}
}