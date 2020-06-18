//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

//import static java.lang.System.*;

public class Social
{
   private String socialNum;
   private int sum;

	public Social()
	{
		socialNum = "";
		sum = 0;
	}
	public Social(String soc)
	{
		socialNum = soc;
	}
	public void setWord(String w)
	{
		socialNum = w;
	}

	public void chopAndAdd()
	{
		int indexOfFirstDash = socialNum.indexOf("-");
		int indexOfSecondDash = socialNum.lastIndexOf("-");
		
		int sub1 = Integer.parseInt(socialNum.substring(0,indexOfFirstDash));
		int sub2 = Integer.parseInt(socialNum.substring(indexOfFirstDash + 1, indexOfSecondDash));
		int sub3 = Integer.parseInt(socialNum.substring(indexOfSecondDash+1));
		sum = sub1 + sub2 + sub3;
	}

	public String toString()
	{
		chopAndAdd();
		return "SS# " + socialNum + " has a total of " + sum + "\n";
	}
}