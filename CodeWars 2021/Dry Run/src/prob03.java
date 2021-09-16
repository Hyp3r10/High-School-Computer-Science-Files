import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prob03 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in); // Used for submission
		//Scanner scan = new Scanner(new File("prob03/prob03-1-in.txt")); // Used for testing
		String output = "";
		int num = scan.nextInt();
		switch(num) {
			case 1 : {output = "one"; break;}
			case 2 : {output = "two"; break;}
			case 3 : {output = "three"; break;}
			case 4 : {output = "four"; break;}
			case 5 : {output = "five"; break;}
			case 6 : {output = "six"; break;}
			case 7 : {output = "seven"; break;}
			case 8 : {output = "eight"; break;}
			case 9 : {output = "nine"; break;}
			case 10 : {output = "ten"; break;}
		}
		System.out.println(output);
		scan.close();
	}
}
