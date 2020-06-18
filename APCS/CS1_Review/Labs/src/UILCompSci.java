public class UILCompSci {
	
	private static String str;
	private static int correct;
	private static int incorrect; 
	private static int score;
	private static int skips;
	
	public static void main(String[] args)
    {
		UILCompSci test = new UILCompSci();
		
        str = Utility.readString("Enter contestant's name --> ");
        correct = Utility.readInt("Number correct --> ");
        incorrect = Utility.readInt("Number incorrect --> ");
        
        test.calculateSkips();
        test.calculateScore();
        
        System.out.println(test);
    }
	public UILCompSci() {
		str = "";
		correct = 0;
		incorrect = 0;
		score = 0;
		skips = 0;
	}
	public void calculateSkips() {
		skips = (40) - (correct + incorrect);
	}
	public void calculateScore() {
		score = (correct * 6) - (2 * incorrect);
	}
	@Override
	public String toString() {
		return "\nContestant's Name : " + str + 
			   "\nCorrect           : " + correct +
			   "\nIncorrect         : " + incorrect + 
			   "\nSkips             : " + skips + 
			   "\n------------------------------" + 
			   "\nScore             : " + score;
	}
}