import java.util.*;

public class StudentAnswerSheetDriver
{
	public static void main(String[] args)
	{
		// create answer key
		String[] key = {"A", "C", "D", "E", "B", "C", "E", "B", "B", "C"};
		ArrayList<String> answerKey = new ArrayList<String>();
		for(int i=0; i < key.length; i++)
		{
			answerKey.add(key[i]);
		}
		
		
		String[] answers1 = {"A", "B", "D", "E", "A", "C", "?", "B", "D", "C"};
		StudentAnswerSheet student1 = new StudentAnswerSheet("John Wayne", answers1);
		System.out.println(student1.getName() + " score = " + student1.getScore(answerKey));
		
		
		
		String[] answers2 = {"A", "C", "D", "E", "B", "C", "E", "B", "A", "C"};
		StudentAnswerSheet student2 = new StudentAnswerSheet("Jimmy Stewart", answers2);
		System.out.println(student2.getName() + " score = " + student2.getScore(answerKey));
		
		String[] answers3 = {"?", "C", "D", "E", "A", "C", "?", "B", "D", "A"};
		StudentAnswerSheet student3 = new StudentAnswerSheet("Henry Fonda", answers3);
		System.out.println(student3.getName() + " score = " + student3.getScore(answerKey));
		

		
		TestResults test = new TestResults();
		test.add(student1);
		test.add(student2);
		test.add(student3);
		
		System.out.println();
		System.out.println("Highest Score - " + test.highestScoringStudent(answerKey));
		System.out.println();
		
	}
}