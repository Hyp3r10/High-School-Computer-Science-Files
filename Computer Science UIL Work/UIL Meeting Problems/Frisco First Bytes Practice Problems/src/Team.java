import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Team {
	public static void main(String[] args) throws IOException {
		Scanner file = new Scanner(new File("team.dat"));
		int numTimes = file.nextInt();
		file.nextLine();

		for(int i = 0; i < numTimes; i++) {
			int n = file.nextInt();
			int t = file.nextInt();
			file.nextLine();
			
			
			ArrayList<Student> students = new ArrayList<Student>();
			while(file.hasNextLine()) {
				Scanner temp = new Scanner(file.nextLine());
				String name = temp.next();
				int score = temp.nextInt();
				temp.close();
			}
			
			students = Student.sort(students);
		}
	}
}
class Student {
	public String name;
	public int points;
	
	public Student(String name, int points) {
		this.name = name;
		this.points = points;
	}
	
	public static ArrayList<Student> sort(ArrayList<Student> list) {
		ArrayList<Student> students = list;
		
		int i = 0;
		
		do {
			if(list.get(i).points < list.get(i+1).points) {
				Student temp = students.get(i);
				students.set(i, students.get(i+1));
				students.set(i+1, temp);		
			}
		} while((i+1 < students.size()) && list.get(i).points > list.get(i+1).points);
		
		for(int j = 0; j < students.size(); j++) {
			System.out.printf("Name :: %s	Points :: %d", students.get(j).name, students.get(j).points);
		}
		
		return students;
	}
}
