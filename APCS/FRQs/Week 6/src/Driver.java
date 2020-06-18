
public class Driver
{

	public static void main(String[] args)
	{
		System.out.println("TESTING RANDOOM STRING CHOOSER");
		System.out.println("==============================\n");

		String[] wordArray1 = {"wheels", "on", "the", "bus"}; 
		RandomStringChooser sChooser = new RandomStringChooser(wordArray1); 
		for (int k = 0; k < 6; k++)
		{
			System.out.print(sChooser.getNext() + " ");
		}

		System.out.println("\n");

		String[] wordArray2 = {"Taco", "Cat"}; 
		sChooser = new RandomStringChooser(wordArray2); 
		for (int k = 0; k < 3; k++)
		{
			System.out.print(sChooser.getNext() + " ");
		}

		System.out.println("\n");

		String[] wordArray3 = {"memes", "are", "dreams"}; 
		sChooser = new RandomStringChooser(wordArray3); 
		for (int k = 0; k < 3; k++)
		{
			System.out.print(sChooser.getNext() + " ");
		}

		System.out.println("\n\n");

		System.out.println("TESTING RANDOOM LETTER CHOOSER");
		System.out.println("==============================\n");

		RandomLetterChooser letterChooser = new RandomLetterChooser("cat"); 
		for (int k = 0; k < 4; k++)
		{
			System.out.print(letterChooser.getNext());
		}

		System.out.println("\n");
		
		letterChooser = new RandomLetterChooser("texts"); 
		for (int k = 0; k < 5; k++)
		{
			System.out.print(letterChooser.getNext());
		}

		System.out.println("\n");

		letterChooser = new RandomLetterChooser("four"); 
		for (int k = 0; k < 8; k++)
		{
			System.out.print(letterChooser.getNext());
		}

		System.out.println("\n");



	}

}
