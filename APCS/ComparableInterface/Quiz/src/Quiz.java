import java.util.*;

public class Quiz {
	private ArrayList <Question> questions;

	public static void main(String[] args) {
		Quiz quiz = new Quiz();
	}
	public Quiz() {
		questions = new ArrayList <Question>();

		questions.add(new TrueFalse("Houston is the capital of Texas.","F"));
		questions.add(new MultipleChoice("The capital of Texas is",
				"Houston",
				"San Antonio",
				"Austin",
				"Dallas",
				"Austin"));
		questions.add(new MultipleChoice("The largest city in Texas is",
				"Houston",
				"San Antonio",
				"Austin",
				"Dallas",
				"Houston"));
		questions.add(new TrueFalse("The tallest mountain in Texas is Guadalupe Peak.", "T"));

		displayTest();
	}
	// prints the entire quiz numbering the questions from 1 to question.size()
	public void displayTest() {
		ArrayList<String> user = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		int qNum = 1;

		for(Question question : questions) {
			System.out.println(qNum + ". " + question);
			System.out.print("Answer :: ");
			user.add(scan.nextLine());
			System.out.println("");
			qNum++;
		}

		qNum = 1;

		System.out.println("\n              Answer Key	");
		System.out.println("------------------------------------------");
		System.out.println("Question # | Your Answer | Correct Answer ");
		for(String answer : user) {
			System.out.println("    " + qNum + "             " + user.get(qNum-1) + "          " + questions.get(qNum-1).getAnswer());
			qNum++;
		}
	}
}
class TrueFalse implements Question {
	private String question;
	private String answer;

	public TrueFalse(String question, String answer) {
		this.question = question;
		this.answer = answer;
	}
	public String getQuestion() {
		return question;
	}
	public String getAnswer() {
		return answer;
	}
	public String toString() {
		return "T/F " + getQuestion();
	}
}
class MultipleChoice implements Question {
	private String question;
	private String answer1;
	private String answer2;
	private String answer3;
	private String answer4;	
	private String correctAnswer;	

	public MultipleChoice(String question, String answer1, String answer2, String answer3, String answer4, String correctAnswer) {
		this.question = question;
		this.answer1 = answer1;
		this.answer2 = answer2;
		this.answer3 = answer3;
		this.answer4 = answer4;
		this.correctAnswer = correctAnswer;
	}
	public String getQuestion() {
		return question;
	}
	public String getAnswer() {
		return correctAnswer;
	}
	public String toString() {
		return getQuestion() + 
				"\n   a. " + answer1 +
				"\n   b. " + answer2 + 
				"\n   c. " + answer3 + 
				"\n   d. " + answer4;
	}
}
interface Question {
	String getQuestion();   // returns the question in the appropriate format
	String getAnswer();     // returns the question's answer
}