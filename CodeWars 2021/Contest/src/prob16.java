/**
 * @author MatthewSheldon
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prob16 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in); // Used for submission
		//Scanner scan = new Scanner(new File("prob16/prob16-4-in.txt")); // Used for testing
		String[] input = scan.nextLine().split(" ");
		double base10Size = Double.parseDouble(input[0]); 
		String base10Unit = input[1];
		double bits = convertToBits(base10Size, base10Unit);
		System.out.println(bits);
		System.out.println(convertBitsToBase2(bits));
		scan.close();
	}
	public static double convertToBits(double size, String unit) {
		double result = 0.0;
		switch(unit) {
			case "B" : {
				result = size * 8.0;
				break;
			}
			case "KB" : {
				result = size * 8.0 * 1000.0;
				break;
			}
			case "MB" : {
				result = size * 8.0 * 1000000.0;
				break;
			}
			case "GB" : {
				result = size * 8.0 * 1.0e+9;
				break;
			}
			case "TB" : {
				result = size * 8.0 * 1.0e+12;
				break;
			}
			case "PB" : {
				result = size * 8.0 * 1.0e+15;
				break;
			}
			case "EB" : {
				result = size * 8.0 * 1.0e+18;
				break;
			}
			case "ZB" : {
				result = size * 8.0 * 1.0e+21;
				break;
			}
		}
		return result;
	}
	public static String convertBitsToBase2(double bits) {
		String output = "";
		double zebibyte = bits / (8.0 * 1024.0 * 1024.0 * 1024.0 * 1024.0 * 1024.0 * 1024.0 * 1024.0);
		double exbibyte = bits / (8.0 * 1024.0 * 1024.0 * 1024.0 * 1024.0 * 1024.0 * 1024.0);
		double pebibyte = bits / (8.0 * 1024.0 * 1024.0 * 1024.0 * 1024.0 * 1024.0);
		double tebibyte = bits / (8.0 * 1024.0 * 1024.0 * 1024.0 * 1024.0);
		double gibibyte = bits / (8.0 * 1024.0 * 1024.0 * 1024.0);
		double mebibyte = bits / (8.0 * 1024.0 * 1024.0);
		double kibibyte = bits / (8.0 * 1024.0);
		double bytes = bits / 8.0;
		if(zebibyte > 1) {
			output = String.format("%.2f", zebibyte) + " " + "ZiB";
		}
		else if(exbibyte > 1) {
			output = String.format("%.2f", exbibyte) + " " + "EiB";
		}
		else if(pebibyte > 1) {
			output = String.format("%.2f", pebibyte) + " " + "PiB";
		}
		else if(tebibyte > 1) {
			output = String.format("%.2f", tebibyte) + " " + "TiB";
		}
		else if(gibibyte > 1) {
			output = String.format("%.2f", gibibyte) + " " + "GiB";
		}
		else if(mebibyte > 1) {
			output = String.format("%.2f", mebibyte) + " " + "MiB";
		}
		else if(kibibyte > 1) {
			output = String.format("%.2f", kibibyte) + " " + "KiB";
		}
		else if(bytes > 1) {
			output = String.format("%.2f", bytes) + " " + "B";
		}
		else {
			output = String.format("%.2f", bits) + " " + "Bits";
		}
		return output;
	}
}