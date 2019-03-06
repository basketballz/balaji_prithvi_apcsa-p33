import java.util.Arrays;

public class PUBLICCLASS
{
	
	public static void go(int num)
	{
	    int digit = 0 ;
	    int sum =0;
	    int [] cow = new int [10000];
	  int counter=0;
	    
	    while (num>0)
	    {
	    digit = num%10 ;
	    cow[counter] = digit;
	    num=num/10;
	    counter++;
	    }
	    
	    for ( int j=counter-1; j>=0;j--)
	    {
	    	System.out.print(cow[j]);
	    
	    }

	    
	   
	  }
		
		
		
		
	}
