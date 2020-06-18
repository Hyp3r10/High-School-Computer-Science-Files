public class AppointmentDriver
{
	public static void main(String[] args)
	{
		DailySchedule schedule = new DailySchedule();
		
		// To simplify the program, time was represented in milliseconds.
		
		Appointment appoint1 = new Appointment("Appointment 1", 1000, 1999);
		Appointment appoint2 = new Appointment("Appointment 2", 2000, 2999);
		Appointment appoint3 = new Appointment("Appointment 3", 3000, 3999);
		Appointment appoint4 = new Appointment("Appointment 4", 4000, 4999);
		Appointment appoint5 = new Appointment("Appointment 5", 5000, 5999);
		
		schedule.addAppt(appoint1, false);
		schedule.addAppt(appoint2, false);
		schedule.addAppt(appoint3, false);
		schedule.addAppt(appoint4, false);
		schedule.addAppt(appoint5, false);
		
		
		System.out.println(schedule);
		
		Appointment appoint6 = new Appointment("Appointment 6", 3100, 3500);
		schedule.addAppt(appoint6, true);
		
		System.out.println();
		System.out.println("Appointment 6 conflicts with Appointment 3.");
		System.out.println("Since it is an emergency Appointment 6 is added");
		System.out.println("and Appointment 3 is removed.");
		System.out.println();
		
		System.out.println(schedule);
		
		Appointment appoint7 = new Appointment("Appointment 7", 1999, 2001);
		schedule.addAppt(appoint7, true);
		
		System.out.println();
		System.out.println("Appointment 7 conflicts with both Appointment 1 and Appointment 2.");
		System.out.println("Since it is an emergency Appointment 7 is added");
		System.out.println("and Appointment 1 and Appointment 2 are removed.");
		System.out.println();
		
		System.out.println(schedule);
		
		Appointment appoint8 = new Appointment("Appointment 8", 5001, 5900);
		if(schedule.addAppt(appoint8, false) == false)
		   System.out.println("***Appointment 8 was not added***");
		
		System.out.println();
		System.out.println("Appointment 8 conflicts with Appointment 5.");
		System.out.println("However, it is not an emergency so it is not added");
		System.out.println("and Appointment 5 is not removed.");
		System.out.println();
		
		System.out.println(schedule);
		
	}
}