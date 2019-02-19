//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import java.util.Scanner;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		LetterRemover s = new LetterRemover();
		
		System.out.print("Sentence :: ");
		String sentences = keyboard.nextLine();
		System.out.print("letter to remove :: ");
		char character = keyboard.next().charAt(0);
		s.setRemover(sentences, character);
		s.removeLetters();
		System.out.print(s);
		
		System.out.print("\n\n\nSentence :: ");
		String sentences1 = keyboard.next();
		System.out.print("letter to remove :: ");
		char character1 = keyboard.next().charAt(0);
		s.setRemover(sentences1, character1);
		s.removeLetters();
		System.out.print(s + "\n\n\n");
		
		System.out.print("Sentence :: ");
		String sentences2 = keyboard.next();
		System.out.print("letter to remove :: ");
		char character2 = keyboard.next().charAt(0);
		s.setRemover(sentences2, character2);
		s.removeLetters();
		System.out.print(s + "\n\n\n");
		
		System.out.print("Sentence :: ");
		String sentences3 = keyboard.next();
		System.out.print("letter to remove :: ");
		char character3 = keyboard.next().charAt(0);
		s.setRemover(sentences3, character3);
		s.removeLetters();
		System.out.print(s + "\n\n\n");
		
		System.out.print("Sentence :: ");
		String sentences4 = keyboard.next();
		System.out.print("letter to remove :: ");
		char character4 = keyboard.next().charAt(0);
		s.setRemover(sentences4, character4);
		s.removeLetters();
		System.out.print(s + "\n\n\n");
		
		
		System.out.print("Sentence :: ");
		String sentences5 = keyboard.nextLine();
		System.out.print("letter to remove :: ");
		char character5 = keyboard.next().charAt(0);
		s.setRemover(sentences, character);
		s.removeLetters();
		System.out.print(s);
		
		System.out.print("\n\n\nSentence :: ");
		String sentences6 = keyboard.next();
		System.out.print("letter to remove :: ");
		char character6 = keyboard.next().charAt(0);
		s.setRemover(sentences1, character1);
		s.removeLetters();
		System.out.print(s + "\n\n\n");
		
		System.out.print("Sentence :: ");
		String sentences7 = keyboard.next();
		System.out.print("letter to remove :: ");
		char character7 = keyboard.next().charAt(0);
		s.setRemover(sentences2, character2);
		s.removeLetters();
		System.out.print(s + "\n\n\n");
		
		System.out.print("Sentence :: ");
		String sentences8 = keyboard.next();
		System.out.print("letter to remove :: ");
		char character8 = keyboard.next().charAt(0);
		s.setRemover(sentences3, character3);
		s.removeLetters();
		System.out.print(s + "\n\n\n");
		
		System.out.print("Sentence :: ");
		String sentences9 = keyboard.next();
		System.out.print("letter to remove :: ");
		char character9 = keyboard.next().charAt(0);
		s.setRemover(sentences4, character4);
		s.removeLetters();
		System.out.print(s + "\n\n\n");

											
	}
}