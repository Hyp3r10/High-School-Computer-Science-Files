public class Gold extends Donation {
	public String name;
	public Gold(String name) {
		super(name);
	}
	public String getClub() {
		return "Gold";
	}
	public double getAmount() {
		return 500.0;
	}
}