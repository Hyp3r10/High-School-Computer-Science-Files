import java.util.*;

public class DailySchedule
{
	// contains Appointment objects, no two Appointments overlap
	private ArrayList<Appointment> apptList;

	public DailySchedule()
	{ 
		apptList = new ArrayList<Appointment>();
	}

	// part (b)
	// removes all appointments that overlap the given Appointment
	// postcondition: all appointments that have a time conflict with
	//appt have been removed from this DailySchedule
	public void clearConflicts(Appointment appt)
	{ 
		for(int i = apptList.size()-1; i >= 0; i--) {
			if(apptList.get(i).getTime().overlapsWith(appt.getTime())) {
				apptList.remove(i);
			}
		}
	}


	// part (c)
	// if emergency is true, clears any overlapping appointments and adds
	// appt to this DailySchedule; otherwise, if there are no conflicting
	// appointments, adds appt to this DailySchedule;
	// returns true if the appointment was added;
	// otherwise, returns false
	public boolean addAppt(Appointment appt, boolean emergency)
	{ 
		if(emergency) {
			clearConflicts(appt);
			apptList.add(appt);
			return true;
		}
		int count = 0;
		for(int i = 0; i < apptList.size(); i++) {
			if(apptList.get(i).conflictsWith(appt)) {
				count++;
			}
		}
		if(count == 0) {
			apptList.add(appt);
			return true;
		}
		else {
			return false;
		}
	}

	public String toString()
	{
		String str = "";

		for(Appointment appt : apptList)
		{
			str += appt.getDescription() + "     " + appt.getTime().toString() + "\n";
		}

		return str;
	}

}