
public enum Fruit {
	APPLE("RED"), BANANA("YELLOW"), GRAPES("GREEN"), ORANGE;
	private String color;
	private Fruit() {
		System.out.println("Constructor called for: " + this.toString());
	}
	private Fruit(String color) {
		System.out.println("Constructor called for: " + this.toString());
		this.color = color;
	}
	public String getColor() {
		return this.color;
	}
}
