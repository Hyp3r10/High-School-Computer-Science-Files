import java.util.Scanner;

public class C {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numTimes = scan.nextInt(); scan.nextLine();
		for(int i = 0; i < numTimes; i++) {
			long n = Long.parseLong(scan.nextLine());
			int numDifferences = 0;
			for(long l = 0; l < n; l++) {
				String one = Long.toBinaryString(l);
				String two = Long.toBinaryString(l+1);
				
				if(one.length() != two.length()) {
					numDifferences++;
					for(int index = 0; index < one.length(); index++) {
						if(one.charAt(one.length() - index -1) != two.charAt(two.length() - index -1)) {
							numDifferences++;
						}
					}
				}
				else { 
					for(int index = 0; index < one.length(); index++) {
						if(one.charAt(index) != two.charAt(index)) {
							numDifferences++;
						}
					}
				}
			}
			
			System.out.println(numDifferences);
		}
	}
}
