// MathLab05st.java
// The Number System Converter
// This is the student, starting version of the MathLab05 assignment.

import java.util.Scanner;

public class MathLab05st2
{
	public static void main (String args[]) 		
	{  
		System.out.println("MathLab05 - Number Conversion Program\n\n");
		
		// The next 2 lines are used in all versions.
		 System.out.println("ABCD1234 Base-16 converts to " + BaseConverter2.fromHexToBin("ABCD1234") + " in Base-2.\n");
		 System.out.println("E12B47F5 Base-16 converts to " + BaseConverter2.fromHexToBin("E12B47F5") + " in Base-2.\n");
		
		// The next 2 lines are used in the 90-point versions and above.
		 System.out.println("1011111011101111 Base-2 converts to " + BaseConverter2.fromBinToDec("1011111011101111") + " in Base-10.\n");
		 System.out.println("11100100100110110 Base-2 converts to " + BaseConverter2.fromBinToDec("11100100100110110") + " in Base-10.\n");

		// The next line is used in the 95-point versions and above.		
		 System.out.println("1011111011101111 Base-2 converts to " + BaseConverter2.fromBinToHex("1011111011101111") + " in Base-16.\n");

		// The next line is used in the 100-point versions and above.		
		 System.out.println("11100100100110110 Base-2 converts to " + BaseConverter2.fromBinToHex("11100100100110110") + " in Base-16.\n");
		
		// The next 3 lines are used in the 105 and 110-point versions.
		System.out.println("1000 Base-10 converts to " + BaseConverter2.fromDecToAny(1000,5) + " in Base-5.\n");
		 System.out.println("1000 Base-10 converts to " + BaseConverter2.fromDecToAny(1000,8) + " in Base-8.\n");
		 System.out.println("200 Base-10 converts to " + BaseConverter2.fromDecToAny(200,2) + " in Base-2.\n");
		
		// This last line is only used in the 110 point version.
		 System.out.println("48879 Base-10 converts to " + BaseConverter2.fromDecToAny(48879,16) + " in Base-16.\n");
	}
}
class BaseConverter2
{
	// Complete
    public static String fromHexToBin(String hexNum)
    {
    	String binNum = "";
    	long temp = 0;
    	long finalTemp = 0;
    	String digits = "0123456789ABCDEF";
    	//Convert to base 10
    	for(int i = 0; i < hexNum.length(); i++) 
    	{	
    		temp = digits.indexOf(hexNum.charAt(i));
    			
    		finalTemp = (finalTemp * 16) + temp;
    	}
    	    	
    	int idx = 0;
    	
    	for(long i = finalTemp; i > 0; i /= 2) 
    	{	
    		idx = (int)(i % 2);
    		binNum = digits.charAt(idx) + binNum;
    	}
    	
    	return binNum;
    }
    // Complete
    public static int fromBinToDec(String binNum) {
    	String decNum = "";
    	long temp = 0;
    	long finalTemp = 0;
    	String digits = "0123456789ABCDEF";
    	//Convert to base 10
    	for(int i = 0; i < binNum.length(); i++) 
    	{	
    		temp = digits.indexOf(binNum.charAt(i));
    			
    		finalTemp = (finalTemp * 2) + temp;
    	}
    	
    	return (int)finalTemp;   	
    }
    // Complete
    public static String fromBinToHex(String binNum)
    {
    	String hexNum = "";
    	long temp = 0;
    	long finalTemp = 0;
    	String digits = "0123456789ABCDEF";
    	//Converts to base 10
    	for(int i = 0; i < binNum.length(); i++) 
    	{	
    		temp = digits.indexOf(binNum.charAt(i));
    			
    		finalTemp = (finalTemp * 2) + temp;
    	}
    	    	
    	int idx = 0;
    	// Changes to a string/base converter
    	for(int i = (int) finalTemp; i > 0; i /= 16) 
    	{	
    		idx = i % 16;
    		hexNum = digits.charAt(idx) + hexNum;
    	}
    	
    	return hexNum;
    }    
    // Complete
    public static String fromDecToAny(int decNum, int desiredBase)
    {
    	String hexNum = "";
    	String digits = "0123456789ABCDEF";
    	    	
    	int idx = 0;
    	// Changes to a string/base converter
    	for(int i = decNum; i > 0; i /= desiredBase) 
    	{	
    		idx = i % desiredBase;
    		hexNum = digits.charAt(idx) + hexNum;
    	}
    	
    	return hexNum;    	
    }
}
