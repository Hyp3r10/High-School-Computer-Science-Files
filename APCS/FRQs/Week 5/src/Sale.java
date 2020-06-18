public class Sale extends Transaction {
	private double precent, discount, cost;
	public Sale(String d, int q, double c, double p) {
		super(d,q,c);
		precent = p;
	}
	@Override
	public double getTotal() {
		cost = getNumItems() * getItemCost();
		discount = cost * precent;
		cost -= discount;
		cost += cost * TAX_RATE;
		return cost;
	}
	@Override 
	public String toString() {
		return super.toString() + "\nDiscount Savings : " + discount;
	}
}