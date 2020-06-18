/*
ID: punchwo1
LANG: JAVA
TASK: ride
*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ride {
	public static void main(String[] args) throws IOException {
		try (Scanner scan = new Scanner(new BufferedReader(new FileReader("ride.in")))) {
		    try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")))) {
		    	String alphabet ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
				char[] line1 = scan.nextLine().toCharArray();
				char[] line2 = scan.nextLine().toCharArray();
				int num1 = 1;
				int num2 = 1;
				for(char curr : line1) {
					num1 *= (alphabet.indexOf(curr) + 1);
				}
				for(char curr : line2) {
					num2 *= (alphabet.indexOf(curr) + 1);
				}
				if(num1%47 == num2%47) {
					out.println("GO");
				}
				else {
					out.println("STAY");
				}
		    }
		}


	}
}
