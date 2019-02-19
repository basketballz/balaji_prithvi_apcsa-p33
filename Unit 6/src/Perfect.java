import static java.lang.System.*;

public class Perfect
{
   private int numberperfect;

	public Perfect()
	{
		setNumbers(0);
	}
	public Perfect(int a)
	{
		setNumbers(a);
	}

	public void setNumbers(int a)
	{
		numberperfect = a;
	}

	public boolean isPerfect()
	{
		int total = 0;
		
		for (int i = 1; i < numberperfect; i++)
		{
			if (numberperfect % i == 0)
			{
				total = total + i;
			}
			
		}
		
		if (total == numberperfect)
		{
			return true;
		}
		
		return false; 
	}

	public String toString()
	{
		if (isPerfect() == true) {
			String output = numberperfect + " is perfect";
			return output;
		}
		String output = numberperfect + " is not perfect";
		return output;
		
	}
	
}