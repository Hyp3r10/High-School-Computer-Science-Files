public class DeluxeSuite extends Suite {
	public DeluxeSuite(int id) {
		super(id);
	}
	@Override
	public double getRoomRate() {
		return 100.00;
	}
	@Override
	public String getBedType() {
		return "King";
	}
}