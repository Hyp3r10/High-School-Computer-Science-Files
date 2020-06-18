// MathLab05st.java
// The Number System Converter
// This is the student, starting version of the MathLab05 assignment.

import java.util.Scanner;

public class MathLab05st
{
	public static void main (String args[]) 		
	{  
		System.out.println("MathLab05 - Number Conversion Program\n\n");
		
		// The next 2 lines are used in all versions.
		 System.out.println("ABCD1234 Base-16 converts to " + BaseConverter.fromHexToBin("ABCD1234") + " in Base-2.\n");
		 System.out.println("E12B47F5 Base-16 converts to " + BaseConverter.fromHexToBin("E12B47F5") + " in Base-2.\n");
		
		// The next 2 lines are used in the 90-point versions and above.
		 System.out.println("1011111011101111 Base-2 converts to " + BaseConverter.fromBinToDec("1011111011101111") + " in Base-10.\n");
		 System.out.println("11100100100110110 Base-2 converts to " + BaseConverter.fromBinToDec("11100100100110110") + " in Base-10.\n");

		// The next line is used in the 95-point versions and above.		
		 System.out.println("1011111011101111 Base-2 converts to " + BaseConverter.fromBinToHex("1011111011101111") + " in Base-16.\n");

		// The next line is used in the 100-point versions and above.		
		 System.out.println("11100100100110110 Base-2 converts to " + BaseConverter.fromBinToHex("11100100100110110") + " in Base-16.\n");
		
		// The next 3 lines are used in the 105 and 110-point versions.
		System.out.println("1000 Base-10 converts to " + BaseConverter.fromDecToAny(1000,5) + " in Base-5.\n");
		 System.out.println("1000 Base-10 converts to " + BaseConverter.fromDecToAny(1000,8) + " in Base-8.\n");
		 System.out.println("200 Base-10 converts to " + BaseConverter.fromDecToAny(200,2) + " in Base-2.\n");
		
		// This last line is only used in the 110 point version.
		 System.out.println("48879 Base-10 converts to " + BaseConverter.fromDecToAny(48879,16) + " in Base-16.\n");
	}
}
class BaseConverter
{
	// Complete
    public static String fromHexToBin(String hexNum)
    {
    	String binNum = "";
    	String hexDigits = "0123456789ABCDEF";
        long decNum = 0;
        int count = 0;
        for(int i = hexNum.length(); i > 0; i--) {
        	long base = (long)Math.pow(16, count);
        	long digit = hexDigits.indexOf(hexNum.charAt(i-1));
        	decNum += base * digit;
        	count++;
        }
        // Ladder (decimal -> any)
        long remainder = 0;
        long div = decNum;
        while(remainder <= div) {
        	remainder = div % 2; 
        	div /= 2;
        	binNum = String.valueOf(remainder) + binNum;
        }
    	return binNum;
    }
    // Complete
    public static int fromBinToDec(String binNum) {
    	int decNum = 0;
    	int count = 0;
    	for(int i = binNum.length(); i > 0; i--) {
    		decNum += (Integer.parseInt(binNum.substring(i-1, i)) * Math.pow(2, count));
    		count++;
    	}
    	return decNum;    	
    }
    // Complete
    public static String fromBinToHex(String binNum) {
    	String hexNum = "";
    	int decTemp = fromBinToDec(binNum);
    	hexNum = String.valueOf(fromDecToAny(decTemp, 16));
    	return hexNum;
    }  
    // Complete
    public static String fromDecToAny(int decNum, int desiredBase)
    {
    	String newNum = "";
    	String hexDigits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    	 long remainder = 0;
         long div = decNum;
         while(div > 0) {
         	remainder = div % desiredBase; 
         	div /= desiredBase;
         	if(remainder <= 9) {
         		newNum = String.valueOf(remainder) + newNum;
         	}
         	else {
         		newNum = String.valueOf(hexDigits.charAt((int)remainder)) + newNum;
         	}
         }
    	return newNum;       	
    }
}
