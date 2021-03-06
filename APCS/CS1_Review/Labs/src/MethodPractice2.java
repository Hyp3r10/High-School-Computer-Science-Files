public class MethodPractice2
{

      // Implement methods below this line
    private void greeting(String firstName, int num) {
    	for(int i = 0; i < num; i++) {
    		System.out.println(firstName + ", have a nice day!");
    	}
    }
    private void range(int begin, int end) {
    	for(int i = begin; i <= end; i++) {
    		System.out.println(i);
    	}
    } 
    private boolean compare(String word) {
    	boolean comparison = false;
    	int len = word.length();
    	String first, last;
    	first = word.substring(0,1);
    	last = word.substring(len-1);
    	if(first.equalsIgnoreCase(last)) {
    		comparison = true;
    	}
    	return comparison;
    }
    private String reverse(String word) {
    	int len = word.length();
    	String b = "";
    	for(int i = len; i > 0; i--) {
    		b += "" + word.charAt(i-1);
    	}
    	return b;
    }
    private byte numOccurrences(String word, String letter) {
    	byte count = 0;
    	int len = word.length();
    	for(int i = 0; i < len; i++) {
    		if(word.substring(i,i+1).equalsIgnoreCase(letter)) {
    			count++;
    		}
    	}
    	return count;
    }
    public static void main(String[] args)
    {
        MethodPractice2 app = new MethodPractice2();

        System.out.println("******************");
        System.out.println("   Test greeting");
        System.out.println("******************");
        app.greeting("Kendall", 6);

        System.out.println("\n\n******************");
        System.out.println("   Test range");
        System.out.println("******************");
        app.range(10, 15);

        System.out.println("\n\n******************");
        System.out.println("   Test compare");
        System.out.println("******************");
        System.out.println(app.compare("demand"));
        System.out.println(app.compare("football"));
        System.out.println(app.compare("bulb"));

        System.out.println("\n\n******************");
        System.out.println("   Test reverse");
        System.out.println("******************");
        System.out.println(app.reverse("ball"));
        System.out.println(app.reverse("courage"));
        System.out.println(app.reverse("hamburger"));

        System.out.println("\n\n******************");
        System.out.println("   Test numOccurrences");
        System.out.println("******************");
        System.out.println(app.numOccurrences("MISSISSIPPI", "I"));
        System.out.println(app.numOccurrences("AUTOMOBILE", "O"));
        System.out.println(app.numOccurrences("TEXAS", "R"));
        System.out.println();
    }
}