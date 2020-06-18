public class Hotel
{
	public static void main(String[] args)
	{
		StandardSuite s = new StandardSuite(1);
		DeluxeSuite d = new DeluxeSuite(2);
		HoneymoonSuite h = new HoneymoonSuite(3);
		
		System.out.println(s);
		System.out.println();
		System.out.println(d);
		System.out.println();
		System.out.println(h);
	}
}