/**
 * @author MatthewSheldon
 */
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Judith {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<BigDecimal> values = new ArrayList<BigDecimal>();
		while(scan.hasNextBigDecimal()) {
			values.add(scan.nextBigDecimal());
		}
		Collections.sort(values);
		for(BigDecimal value : values) {
			System.out.println(value);
		}
	}
}
