//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 
import java.util.Scanner;

public class AddSubMultRunner
{
	public static void main( String args[] )
	{
		System.out.println( AddSubMult.bbigger( 10, 20) );		
		System.out.println( AddSubMult.abigger( 20, 10) );	
		System.out.println( AddSubMult.equal( 20, 20) );
		System.out.println( AddSubMult.equal( 10, 10) );	
		System.out.println( AddSubMult.bbigger( 0, 1) );	
		System.out.println( AddSubMult.abigger( 1, 0 ) );	
		System.out.println( AddSubMult.bbigger( 3.1, 5.7) );	
		System.out.println( AddSubMult.abigger( 5.2 , 3.8 ) );	
		System.out.println( AddSubMult.abigger( 5342, 323 ) );	
		
	}
}