import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * This class creates the index.html file that is used by GitHub Pages
 * for indexing the relative location of different documents
 * @author MatthewSheldon
 */
public class Index {
	private String countryName;	// The name of the current country
	private PrintWriter out;	// The index.html file that we are printing out to
	
	/**
	 * Constructs an Index object for the given country name
	 * @param cN	The country that is currently being generated
	 * @author MatthewSheldon
	 */
	public Index(String cN) {
		this.countryName = cN;
		
		
		try {
			this.out = new PrintWriter(new File("index.html"));
		} catch (FileNotFoundException e) {
			System.out.println("index.html could not successfully be generated.");
			e.printStackTrace();
		}
	}
	
	/**
	 * Generates an index.html file for GitHub pages
	 * @author MatthewSheldon
	 */
	public void generateIndex() {
		out.println("<html>");
		out.println("");
		out.println("<head>");
		out.println("\t<title>Index of /" + this.countryName + "</title>");
		out.println("</head>");
		out.println();
		out.println("<body>");
		out.println("\t<h1>Index of /" + this.countryName + "</h1>");
		out.println("\t<ul>");
		out.println("\t\t<li><a href=\"General Info.html\">General Info</a></li>");
		out.println("\t\t<li><a href=\"Traditions and Holidays.html\">Traditions and Holidays</a></li>");
		out.println("\t\t<li><a href=\"Music.html\">Music</a></li>");
		out.println("\t\t<li><a href=\"Games.html\">Games</a></li>");
		out.println("\t\t<li><a href=\"Food.html\">Food</a></li>");
		out.println("\t\t<li><a href=\"Dress.html\">Dress</a></li>");
		out.println("\t</ul>");
		out.println("</body>");
		out.println("");
		out.println("</html>");
		out.close();
	}
}
