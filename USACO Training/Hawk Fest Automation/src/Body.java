import java.io.PrintWriter;
import java.util.Scanner;
/**
 * This Class will handle printing the Body of the HTML file
 * @author MatthewSheldon
 */
public class Body {
	private String countryName;		// The name of the current Country
	private String informationType;	// The type of information that this page is showing
	private PrintWriter out;		// The HTML file that we are printing out to
	private Scanner scan;			// The Scanner used to get user input
	
	/**
	 * This generates the Body object instantiating all of the global variables
	 * @param cN	The name of the current Country
	 * @param iT	The information type that is currently being built
	 * @param out	The HTML file that we are printing out to 
	 * @param scan	The Scanner used to get user input
	 * @author MatthewSheldon
	 */
	public Body(String cN, String iT, PrintWriter out, Scanner scan) {
		this.countryName = cN;
		this.informationType = iT;
		this.out = out;
		this.scan = scan;
	}
	
	/**
	 * This method will generate the Body of the HTML file calling several methods
	 * in the process 
	 * @author MatthewSheldon
	 */
	public void generateBody() {
		out.println("");
		out.println("<!-- This is the main content of the page -->");
		out.println("<body style=\"font-family: 'LeavesAndGround'; font-weight: normal; font-style: normal;\">");
		
		// Generate the code for the header
		this.generateHeader();
		
		// Generate the code for the middle section
		this.generateSection();
		
		// Generate the code for the footer
		this.generateFooter();
		
		out.println("</body>");
	}
	
	/**
	 * This method will generate the header of the page including the
	 * the name of the country surrounded by the country's flags.
	 * @author MatthewSheldon
	 */
	private void generateHeader() {
		out.println("\t<!-- ");
		out.println("\t\tThis is the Name of the country");
		out.println("\t\t(and maybe the logo with a globe that takes you back to the landing site)");
		out.println("\t-->");
		out.println("\t<header>");
		out.println("\t\t<h2>");
		out.println("\t\t\t<img src=\"General Info/" + this.countryName + "Flag.png\" alt=\"" + this.countryName + "Flag.png\">");
		out.println("\t\t\t" + this.countryName);
		out.println("\t\t\t<img src=\"General Info/" + this.countryName + "Flag.png\" alt=\"" + this.countryName + "Flag.png\">");
		out.println("\t\t</h2>");
		out.println("\t</header>");
	}
	
	/**
	 * This method will generate the section part of the HTML code using two methods:
	 * 	-generateNav
	 * 	-generateArticle
	 * @author MatthewSheldon
	 */
	private void generateSection() {
		out.println();
		out.println("\t\t<!-- ");
		out.println("\t\t\tThis is the Middle block that contains the navigation ");
		out.println("\t\t\tbetween information and the space for the information itself ");
		out.println("\t\t-->");
		out.println("\t\t<section>");
		
		// Generate the Navigation Tabs on the left of the screen in the middle section
		this.generateNav();
		
		// Generate the Article section on the right of the screen if the middle section
		this.generateArticle();
		
		out.println("\t</section>");
	}
	
	/**
	 * This method will generate the navigation section in the HTML code
	 * @author MatthewSheldon
	 */
	private void generateNav() {
		out.println("\t\t<!-- This is the segment with the naviagation between information for a given country -->");
		out.println("\t\t<nav>");
		out.println("\t\t\t<ul>");
		out.println("\t\t\t\t<a href=\"https://hebronhigh.github.io/hawkfest/\">");
		out.println("\t\t\t\t\t<img alt=\"Home\" src=\"WhiteOutlineLogo.png\">");
		out.println("\t\t\t\t\tHome");
		out.println("\t\t\t\t</a>");
		out.println("\t\t\t\t<a href=\"General Info.html\">General Info</a>");
		out.println("\t\t\t\t<a href=\"Traditions and Holidays.html\">Traditions and Holidays</a>");
		out.println("\t\t\t\t<a href=\"Music.html\">Music</a>");
		out.println("\t\t\t\t<a href=\"Games.html\">Games</a>");
		out.println("\t\t\t\t<a href=\"Food.html\">Food</a>");
		out.println("\t\t\t\t<a href=\"Dress.html\">Dress</a>");
		out.println("\t\t\t</ul>");
		out.println("\t\t</nav>");
	}
	
	/**
	 * This method will generate the article section in the HTML code
	 * including most of the content for the given type of information
	 * @author MatthewSheldon
	 */
	private void generateArticle() {
		out.println();
		out.println("\t\t<!-- This is the segment with the content for a given information type -->");
		out.println("\t\t<article>");
		
		/*
		 * This is where a lot of the user input is going to take place
		 * basically prompting the user for any files it wants to add and 
		 * if they want to add any snippet of text before and/or after the media
		 * 
		 * TODO:
		 * 	-Make a method to prompt the user for names of media links (<img>'s, <video>'s, etc.)
		 * 	-Make a method that will prompt the user to add things like titles (<h1>'s),
		 * 	 comments before and or after the media.
		 * 	-Make a method that will print out the resulting code for both of those previous
		 * 	 methods until the user indicates that there are no more media links to add
		 * 		(Editor's note: make sure to include some way to indicate that a page may not
		 * 		 have any of a given information type depending on whether or not we receive
		 * 		 a given information type for a given country)
		 * 
		 * This may all be best suited for it's own Article class
		 */
		
		out.println("\t\t</article>");
	}
	
	/**
	 * This method will generate the footer of the page including the
	 * type of information that is currently being viewed and the label of "Hawkfest 2021" 
	 * @author MatthewSheldon
	 */
	private void generateFooter() {
		out.println("");
		out.println("<!-- This is the footer that will show what tab is currently being viewed -->");
		out.println("\t<footer>");
		out.println("\t\t<p>" + this.informationType + " | Hawk Fest 2021</p>");
		out.println("\t</footer>");
	}
}
