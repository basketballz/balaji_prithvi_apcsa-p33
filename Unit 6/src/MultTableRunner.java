//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class MultTableRunner
{
	public static void main ( String[] args )
	{
		MultTable Multiplier = new MultTable(5,5);
		Multiplier.printTable();
		Multiplier.setTable(3,7);
		Multiplier.printTable();
		Multiplier.setTable(1,6);
		Multiplier.printTable();
		Multiplier.setTable(5,5);
		Multiplier.printTable();
		Multiplier.setTable(9,9);
		Multiplier.printTable();
		Multiplier.setTable(7,10);
		Multiplier.printTable();
		
		
	}
}