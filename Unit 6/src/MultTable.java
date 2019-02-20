//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class MultTable
{
	private int number;
	private int stop;

	public MultTable()
	{
		number=stop=0;
		setTable(number,stop);
	}

	public MultTable(int num, int end)
	{
		number =0;
		stop=0;
		setTable(num,end);
	}

	public void setTable(int num, int end)
	{
		number=num;
		stop=end;
	}

	public void printTable( )
	{
		int i= 1;
		out.println("multiplication table for "+number);
		for (i=1;i<=stop;i++)
		{
			
			out.print(i+"\t"+(i*number)+" ");
			out.println("\n");
			
			
			
			
			///t//
			//\t//
			
			
		}
		
	}
}