//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class Monster1
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		//ask for name and size
		System.out.println("Name and size? ");
		String name = keyboard.next(); 
		int size = keyboard.nextInt();
		
		//instantiate monster one
		Monster One = new Skeleton(name, size);
		
		//ask for name and size
		System.out.println("Name and size? ");
		name = keyboard.next(); 
		size = keyboard.nextInt();
		
		//instantiate monster two
		Skeleton Two = new Skeleton(name, size);
		
		if (One.isBigger(Two))
		{
			System.out.println(One.getName() + " is bigger. ");
		}
		if (One.isSmaller(Two))
		{
			System.out.println( One.getName() + " is smaller. ");
		}
		if (One.namesTheSame(Two))
		{
			System.out.println(One.getName() + " has the same name as " + Two.getName()); 
		}
		
		
	}
}