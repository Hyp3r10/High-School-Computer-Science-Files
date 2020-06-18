import java.util.Scanner;

public class Decryptonomicon {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numTimes = scan.nextInt(); scan.nextLine();
		for(int i = 0 ; i < numTimes; i++) {
			Scanner temp = new Scanner(scan.nextLine());
			String hex = "";
			while(temp.hasNext()) {
				int decimal = Integer.parseInt(temp.next().toUpperCase(), 16);
				System.out.println(decimal);
			}
		}
	}
}
