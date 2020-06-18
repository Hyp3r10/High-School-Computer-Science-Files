public class Silver extends Donation {
	public String name;
	public Silver(String name) {
		super(name);
	}
	public String getClub() {
		return "Silver";
	}
	public double getAmount() {
		return 100.0;
	}
}