
public class Enum101 {
	Day day;
	//Constructor
	public Enum101(Day day) {
		this.day = day;
	}
	public void dayIsLike() {
		switch(day) {
		case MONDAY: {
			System.out.println("Mondays are bad.");
			break;
		}
		case FRIDAY : {
			System.out.println("Fridays are better");
			break;
		}
		case SATURDAY : {
			break;
		}
		case SUNDAY : {
			System.out.println("Weekends are best");
			break;
		}
		default : {
			System.out.println("Midweek days are so-so");
			break;
		}
		}
	}
	public void isWeekend() {
		Day d1 = Day.valueOf("SATURDAY");
		Day d2 = Day.valueOf("SUNDAY");
		
		if(day == d1 || day == d2) {
			System.out.println("Time to get lit!");
		}
		else {
			System.out.println("It's NOT the weekend, get back to work!");
		}
	}
	public static void main(String[] args) {
		String str = "SUNDAY";
		Enum101 t1 = new Enum101(Day.valueOf(str));
		t1.dayIsLike();
	}
}