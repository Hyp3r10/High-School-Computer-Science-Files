//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

//import static java.lang.System.*;

public class StringChecker
{
    private String word;

    public StringChecker()
    {
		word = "";
    }
    public StringChecker(String s)
    {
		word = s;
    } 
    public void setString(String s)
    {
   	    word=s;
    }
	public boolean findLetter(char c)
	{
		boolean answer = false;
		if(word.indexOf(c) != -1) {
			answer = true;
		}
		return answer;
	}
	public boolean findSubString(String s)
	{
		boolean answer = false;
		if(word.indexOf(s) != -1) {
			answer = true;
		}
		return answer;
	}
	@Override
 	public String toString()
 	{
 		return word + "\n\n";
	}
}