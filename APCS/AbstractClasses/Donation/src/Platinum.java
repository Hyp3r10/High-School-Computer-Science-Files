public class Platinum extends Donation {
	public String name;
	public Platinum(String name) {
		super(name);
	}
	public String getClub() {
		return "Platinum";
	}
	public double getAmount() {
		return 1000.0;
	}
}