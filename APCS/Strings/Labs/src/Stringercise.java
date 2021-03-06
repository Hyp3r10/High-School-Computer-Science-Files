public class Stringercise {
	private static String name;
	public static void main(String[] args) {
		Stringercise.part1_2_3_4_5();
		Stringercise.part6_7_8_9_10();
		Stringercise.part11_12_13();
	}
	private static void part1_2_3_4_5() {
		name = "Matthew";
		System.out.println("1.  " + name);
		
		name += " Terry";
		System.out.println("2.  " + name);
		
		name = name.concat(" Sheldon");
		System.out.println("3.  " + name);
		
		name = name.toLowerCase();
		System.out.println("4.  " + name);
		
		name = name.toUpperCase();
		System.out.println("5.  " + name);
	}
	private static void part6_7_8_9_10() {
		System.out.println("6.  " + name.length());
		
		System.out.println("7.  " + name.substring(0,7) + 
						 "\n    " + name.substring(8,14) + 
						 "\n    " + name.substring(14));
		
		System.out.println("8.  " + name.charAt(0) + name.charAt(8) + name.charAt(14));
		
		System.out.println("9.  " + name.indexOf("TERRY"));
		
		char firstLetter = name.charAt(0);
		System.out.println("10. " + name.replace(firstLetter, 'X'));
		
	}
	private static void part11_12_13() {
		int num1 = 5;
		int num2 = 15;
		int num3 = 21;
		String num1S = String.valueOf(num1);
		String num2S = String.valueOf(num2);
		String num3S = String.valueOf(num3);
		System.out.println("11. " + num1S + ", " + num2S + ", " + num3S);
		
		System.out.println("12. " + num1S.compareTo("14") + ", " + num2S.compareTo("14") + ", " + num3S.compareTo("14"));
		
		System.out.println("13. " + ((Integer.parseInt(num1S)) + (Integer.parseInt(num2S)) + (Integer.parseInt(num3S))));
	}
}
