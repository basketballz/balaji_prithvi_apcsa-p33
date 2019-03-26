//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class Skeleton implements Monster
{
	private String name;
	private int size;
	
	public Skeleton(int a, String s) {
		name = s;
		size = a;
	}
	//o
	public int getHowBig() {
		
		return size;
	}

	//o
	public String getName() {
		
		return name;
	}
	public Monster clone ()
	{
		return this;
	}

	//o
	public boolean isBigger(Monster other) {
		
		
		return size>other.getHowBig();
	}

	//o
	public boolean isSmaller(Monster other) {
		
		return size<other.getHowBig();
	}

	//o
	public boolean namesTheSame(Monster other) {
		
		return other.getName().equals(name);
	}
	public String toString() {
		return name + " " + size;
	}
	

	//add code to implement the Monster interface

	//add a toString
}