public class Driver
{
	public static void main(String[] args)
	{
		System.out.println("Primary Test Cases:");
		System.out.println("===================");
		Range[] ranges1 = {new Range(5,8), new Range(10,12), new Range(1,6)};
		MultipleGroups multiple1 = new MultipleGroups(ranges1);
		
		System.out.println("multiple1.contains(2) [should return true.]: " + multiple1.contains(2));
		System.out.println("multiple1.contains(9) [should return false.]: " + multiple1.contains(9));
		System.out.println("multiple1.contains(6) [should return true.]: " + multiple1.contains(6));
		
		System.out.println("\n");
		
		Range[] ranges2 = {new Range(-3,3), new Range(6,9), new Range(-8,-5), new Range(420,420) };
		MultipleGroups multiple2 = new MultipleGroups(ranges2);
		
		System.out.println("Additional Test Cases:");
		System.out.println("======================");
		System.out.println("multiple2.contains(-4) [should return false.]: " + multiple2.contains(-4));
		System.out.println("multiple2.contains(8) [should return true.]: " + multiple2.contains(8));
		System.out.println("multiple2.contains(0) [should return true.]: " + multiple2.contains(0));
		System.out.println("multiple2.contains(420) [should return true.]: " + multiple2.contains(420));
		System.out.println("multiple2.contains(421) [should return false.]: " + multiple2.contains(421));
		
		
	}
}
