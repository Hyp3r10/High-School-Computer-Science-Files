import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Automation {
	private static Scanner scan;		// The scanner used to get user information
	private static String countryName;	// The name of the current country

	/**
	 * When ran, this method will prompt the user for the name of the country, and
	 * will call the methods necessary to build a given country's HTML files
	 * 
	 * @param args
	 * @throws FileNotFoundException
	 * @author MatthewSheldon
	 */
	public static void main(String[] args) {
		// Used for showing how long the program took to run
		double startTime = System.nanoTime();
		
		// Prompt the user for the Name of the country
		scan = new Scanner(System.in);
		System.out.print("What is the name of the Country: ");
		countryName = scan.nextLine();
		
		// Attempt to generate all of the information pages
		generateAllPages();
		
		// Attempt to generate the index.html file
		generateIndex();
		
		// Print out the current running time
		System.out.println("Generated " + countryName + "'s files in " + (System.nanoTime() - startTime) / 1e9 + " seconds.");
	}

	/**
	 * This method will generate all of the different information type pages, including... 
	 * -General Info 
	 * -Traditions and Holidays 
	 * -Music 
	 * -Food 
	 * -Dress
	 * @author MatthewSheldon
	 */
	private static void generateAllPages() {
		// Attempt to generate the General Info.html file
		try {
			generateInformationTypePage("General Info");
		} catch (FileNotFoundException e) {
			System.out.println("General Info.html could not successfully be generated.");
			e.printStackTrace();
		}

		// Attempt to generate the Traditions and Holidays.html file
		try {
			generateInformationTypePage("Traditions and Holidays");
		} catch (FileNotFoundException e) {
			System.out.println("Traditions and Holidays.html could not successfully be generated.");
			e.printStackTrace();
		}

		// Attempt to generate the Music.html file
		try {
			generateInformationTypePage("Music");
		} catch (FileNotFoundException e) {
			System.out.println("Music.html could not successfully be generated.");
			e.printStackTrace();
		}

		// Attempt to generate the Games.html file
		try {
			generateInformationTypePage("Games");
		} catch (FileNotFoundException e) {
			System.out.println("Games.html could not successfully be generated.");
			e.printStackTrace();
		}

		// Attempt to generate the Food.html file
		try {
			generateInformationTypePage("Food");
		} catch (FileNotFoundException e) {
			System.out.println("Food.html could not successfully be generated.");
			e.printStackTrace();
		}

		// Attempt to generate the Dress.html file
		try {
			generateInformationTypePage("Dress");
		} catch (FileNotFoundException e) {
			System.out.println("Dress.html could not successfully be generated.");
			e.printStackTrace();
		}
	}

	/**
	 * This method will generate the entire informaitonType.html file
	 * @param informationType This object indicates the type of information that
	 *                        will be displayed
	 * @throws FileNotFoundException
	 * @author MatthewSheldon
	 */
	private static void generateInformationTypePage(String informationType) throws FileNotFoundException {
		// Create the General Info.html file (there will be one of these for each of the
		// different categories)
		PrintWriter out = new PrintWriter(new File(informationType + ".html"));
		generateBeginning(out);

		// This will generate the body of the HTML file
		generateBody(scan, out, countryName, informationType);

		// Finish printing the current HTML file (this is needed, actually)
		out.close();
	}

	/**
	 * Creates a Beginning class object and calls the method to add the beginning
	 * template to the current HTHML file
	 * 
	 * @param out The current HTML file that we are writing to
	 * @author MatthewSheldon
	 */
	private static void generateBeginning(PrintWriter out) {
		Beginning b = new Beginning();
		b.printBeginingOfHTMFile(out);
	}

	/**
	 * Creates a Body class object and calls the method to add the body to the HTML
	 * File. This method will add all of the country-specific documents to the HTML
	 * file for display.
	 * 
	 * @param scan            The current scanner being used to take in user input
	 * @param out             The current HTML file that we are writing to
	 * @param coutnryName     The name of the country that is currently being built
	 * @param informationType The type of information that is currently being built
	 * @author MatthewSheldon
	 */
	private static void generateBody(Scanner scan, PrintWriter out, String countryName, String informationType) {
		Body b = new Body(countryName, informationType, out, scan);
		b.generateBody();
	}
	
	/**
	 * Generates the index.html file used to index the relative location of things
	 * for the GitHub pages. 
	 * @author MatthewSheldon
	 */
	private static void generateIndex() {
		Index index = new Index(countryName);
		index.generateIndex();
	}
}
