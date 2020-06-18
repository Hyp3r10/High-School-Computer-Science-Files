public class LoudDog extends Dog {
	public LoudDog(String name) {
		super(name);
	}
	@Override
	public String speak() {
		return super.speak() + super.speak();
	}
}