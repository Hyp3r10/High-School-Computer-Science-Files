public class Advance extends Ticket {
	private int daysInAdvance;
	public Advance(int d) {
		daysInAdvance = d;
	}
	@Override
	public double getPrice() {
		if(daysInAdvance >= 10) {
			return 30.00;
		}
		return 40.00;
	}
}