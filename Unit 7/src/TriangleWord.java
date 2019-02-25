//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

class TriangleWord
{
   private String word;

	public TriangleWord()
	{
		setWord("");
	}

	public TriangleWord(String w)
	{
		setWord(w);
	}

	public void setWord(String w)
	{
		word = w;
	}

	public String toString()
	{
		String output="";
		for (int first=0;first<word.length();first++) {
			for (int y=0; y<word.length()-1-first; y++) {
				output+=" ";
			}
			if (first == word.length()-1) {
				for (int j = word.length()-1; j>=0; j--) {
					output+=word.charAt(j);
				}
				for (int x = 1; x<word.length(); x++) {
					output+=word.charAt(x);
				}
			}
			else {
				
					output+=(word.charAt(first));
					for (int j = 0; j<first*2-1; j++) {
						output+=" ";
					}
					if (first > 0) output+=word.charAt(first);
				
			}
			output+="\n";
		}
		return output+"\n";
	}
}