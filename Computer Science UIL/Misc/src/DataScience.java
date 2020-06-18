import java.util.Scanner;

public class DataScience {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextLine()) {
			Scanner temp = new Scanner(scan.nextLine()); temp.next();
			
			String tempLine = temp.next();
			int candidateNumber = Integer.parseInt(tempLine.substring(0, tempLine.indexOf(':')));
			
			int a = temp.nextInt();
			int b = temp.nextInt();
			int c = temp.nextInt();
			
			if((a >= 10 && a <= 20) && a != 13 && a != 17) {
				a = 0;
			}
			if((b >= 10 && b <= 20) && b != 13 && b != 17) {
				b = 0;
			}
			if((c >= 10 && c <= 20) && c != 13 && c != 17) {
				c = 0;
			}
			
			int total = a + b + c;
			System.out.println("Expected Output " + candidateNumber + ": " + total);
		}
		
		
	}
}
