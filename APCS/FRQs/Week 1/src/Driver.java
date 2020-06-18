public class Driver
{
	public static void main(String[] args)
	{
		int[] scores1 = {50, 50, 20, 80, 53}; 
		StudentRecord student1 = new StudentRecord(scores1);
		printScores(scores1);
		System.out.println(student1.finalAverage());
		
		int[] scores2= {20, 50, 50, 53, 80}; 
		StudentRecord student2 = new StudentRecord(scores2);
		printScores(scores2);
		System.out.println(student2.finalAverage());
		
		int[] scores3 = {20, 50, 50, 80}; 
		StudentRecord student3 = new StudentRecord(scores3);
		printScores(scores3);
		System.out.println(student3.finalAverage());
	}
	
	public static void printScores(int[] scores)
	{
		for(int s : scores)
		{
			System.out.print(s + " ");
		}
		System.out.print(" - ");
	}
}