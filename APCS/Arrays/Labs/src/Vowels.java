import java.util.Scanner;
public class Vowels {
	 private Scanner scan = new Scanner(System.in);
	 
	 private String[] words = new String[10];
	 private int[] wordVowelCount = new int[10];
	 
	 private int vowelCount;
	 private int vowelCountY;
	 
	 public static void main(String[] args) {
		 Vowels test = new Vowels();
		 test.setWords();
		 test.findVowels();
		 System.out.println(test);
	 }
	 public void setWords() {
		 System.out.println("Enter 10 words :: ");
		 for(int i = 0; i < words.length; i++) {
			 System.out.print("Word " + (i+1) + " :: ");
			 words[i] = scan.nextLine();
		 }
		 scan.close();
	 }
	 public void findVowels() {
		 int i = 0;
		 int index = 0;
		 while(i < words.length) {
			 String tmp = words[i];
			 while(index < tmp.length()) {
				 if(tmp.charAt(index) == 'a') {
					 vowelCount++;
				 }
				 if(tmp.charAt(index) == 'e') {
					 vowelCount++;
				 }
				 if(tmp.charAt(index) == 'i') {
					 vowelCount++;
				 }
				 if(tmp.charAt(index) == 'o') {
					 vowelCount++;
				 }
				 if(tmp.charAt(index) == 'u') {
					 vowelCount++;
				 }
				 if(tmp.charAt(index) == 'y') {
					 vowelCountY++;
				 }
				 index++;
			 }
			 index = 0;
			 if(vowelCount == 0) {
				 vowelCount = vowelCountY;
			 }
			 wordVowelCount[i] = vowelCount;
			 vowelCount = 0;
			 vowelCountY = 0;
			 i++;
		 }
	 }
	 @Override
	 public String toString() {
		 String output = "\n\n";
		 for(int i = 0; i < words.length; i++) {
			 output += words[i] + " :: " + wordVowelCount[i] + "\n";
		 }
		 return output;
	 }
}
