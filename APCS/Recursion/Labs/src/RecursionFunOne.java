import static java.lang.System.*;

public class RecursionFunOne
{
	public static int countOddDigits(int num)
	{
		int digit;
		if(num>=10)
			digit=num%10;
		else
		{
			if(num%2==1)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
		if(digit%2==1)
		{
			return 1+countOddDigits(num/10);
		}
		return countOddDigits(num/10);
	}
}
