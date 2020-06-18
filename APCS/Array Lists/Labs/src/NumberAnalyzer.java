import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;

public class NumberAnalyzer
{
	private ArrayList<Number> list;

	public NumberAnalyzer()
	{
		list = new ArrayList<Number>();
	}
	public NumberAnalyzer(String numbers)
	{
		list = new ArrayList<Number>();
		numbers += " ";
		int current = 0;
		do {
			list.add(new Number(Integer.parseInt(numbers.substring(current, (numbers.indexOf(" ",current))))));
			current = numbers.indexOf(" ",current) + 1;
		} while(current < numbers.length());
	}
	public void setList(String numbers)
	{
		list = new ArrayList<Number>();
		numbers += " ";
		int current = 0;
		do {
			list.add(new Number(Integer.parseInt(numbers.substring(current, (numbers.indexOf(" ",current))))));
			current = numbers.indexOf(" ",current) + 1;
		} while(current < numbers.length());
	}
	public int countOdds()
	{
		Number app = new Number();
		int oddCount=0;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).isOdd()) {
				oddCount++;
			}
		}
		return oddCount;
	}
	//return oddCount;

	public int countEvens()
	{
		Number app = new Number();
		int evenCount=0;
		for(int i = 0; i < list.size(); i++) {
			if(!list.get(i).isOdd()) {
				evenCount++;
			}
		}
		return evenCount;
	}
	public int countPerfects()
	{
		int perfectCount=0;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).isPerfect()) {
				perfectCount++;
			}
		}
		return perfectCount;
	}
	@Override
	public String toString( )
	{
		return "" + list.toString();
	}
}