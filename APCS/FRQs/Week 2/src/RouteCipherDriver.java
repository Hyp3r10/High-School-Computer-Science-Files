public class RouteCipherDriver
{
	public static void main(String[] args)
	{
		RouteCipher demo1 = new RouteCipher(3, 5, "Meet at noon");

	    System.out.println("fillBlock");
		System.out.println("----------");
		System.out.println(demo1);

	    RouteCipher demo2= new RouteCipher(3, 5, "Meet at midnight");

	    System.out.println("fillBlock");
		System.out.println("----------");
		System.out.println(demo2);
	}
}