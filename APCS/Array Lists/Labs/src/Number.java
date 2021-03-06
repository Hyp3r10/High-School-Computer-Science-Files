import java.util.ArrayList;
public class Number {
	private Integer number;
	private ArrayList<Integer> list = new ArrayList<Integer>();
	public Number() {
		number = 0;
	}
	public Number(int num) {
		number = num;
	}
	public void setNumber(int num) {
		number = num;
	}
	public int getNumber() {
		return number;
	}	
	public boolean isOdd() {
		if(number % 2 == 0) {
			return false;
		}
		else {
			return true;
		}
	}
	public boolean isPerfect() {
		int total=0;
		ArrayListFunHouse test = new ArrayListFunHouse();
		list = test.getListOfFactors(number);
		for(int i = 0; i < list.size(); i++) {
			total += list.get(i);
		}
		return (number==total);
	}	
	@Override
	public String toString( ) {
		return "" + number;
	}
}