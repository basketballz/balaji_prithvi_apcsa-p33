//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class WordRunner
{
	public static void main(String[] args)
	{
		Word word = new Word("hello world");
		System.out.println(word);
		System.out.println("num of vowels == "+word.getNumVowels());
		System.out.println("num of chars == "+word.getLength());

		word.setWord("chicken");
		System.out.println(word);
		System.out.println("num of vowels == "+word.getNumVowels());
		System.out.println("num of chars == "+word.getLength());

		word.setWord("alligator");
		System.out.println(word);
		System.out.println("num of vowels == "+word.getNumVowels());
		System.out.println("num of chars == "+word.getLength());

		word.setWord("elephant");
		System.out.println(word);
		System.out.println("num of vowels == "+word.getNumVowels());
		System.out.println("num of chars == "+word.getLength());

	}
}