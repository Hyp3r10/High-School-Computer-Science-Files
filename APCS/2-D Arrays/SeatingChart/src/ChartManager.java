import java.util.*;

public class ChartManager
{
	public static void main(String[] args)
	{
		Student[][] chart = {{new Student("John","1"), new Student("Amy","2"), new Student("Josey","3"), new Student("vacant",""), new Student("Alan","4")},
							 {new Student("vacant",""), new Student("Fred","5"), new Student("Sam","6"), new Student("vacant",""), new Student("Jill","7")},
							 {new Student("Karen","8"), new Student("vacant",""), new Student("Max","9"), new Student("Alex","10"), new Student("John","11")},
							 {new Student("Suzy","12"), new Student("Callie","13"), new Student("Mary","14"), new Student("vacant",""), new Student("vacant","")},
		                    };
		SeatingChart seatingChart = new SeatingChart(chart);
		System.out.println("---------------------------");
		System.out.println("   Original Seating Chart");
		System.out.println("---------------------------");
		seatingChart.displayChart();

		// test addStudent
		System.out.println("---------------------------");
		System.out.println("   Test addStudent");
		System.out.println("---------------------------");
		if(seatingChart.addStudent(new Student("Rex", "20"), 3,4))
			System.out.println("Rex placed in seat (3,4)");
		else
			System.out.println("Error: Rex not added to seating chart");

		seatingChart.displayChart();

		System.out.println("---------------------------");
		System.out.println("   Test addStudent");
		System.out.println("---------------------------");
		if(seatingChart.addStudent(new Student("Olivia", "21"), 5,2))
			System.out.println("Student placed in seat (3,4)");
		else
			System.out.println("Error: Olivia not added to seating chart at Location (5,2)");

		seatingChart.displayChart();

		// test swapSeats
		System.out.println("---------------------------");
		System.out.println("   Test swapSeats");
		System.out.println("---------------------------");
		if(seatingChart.swapSeats(0,0,2,2))
			System.out.println("John(0,0) and Max(2,2) swapped seats");
		else
			System.out.println("Error: Students not swapped");

		seatingChart.displayChart();

		System.out.println("---------------------------");
		System.out.println("   Test swapSeats");
		System.out.println("---------------------------");
		if(seatingChart.swapSeats(2,0,4,0))
			System.out.println("Students swapped seats");
		else
			System.out.println("Error: Karen(2,0) and Suzy(4,0) not swapped");

		seatingChart.displayChart();

		//test scrambleChart
		System.out.println("---------------------------");
		System.out.println("   Test scrambleChart");
		System.out.println("---------------------------");
		Student[][] newChart = seatingChart.scrambleChart();

		SeatingChart seatingChart2 = new SeatingChart(newChart);
		seatingChart2.displayChart();
	}
}