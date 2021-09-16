import java.io.PrintWriter;
/**
 * This class will handle creating the beginning of each HTML file
 * @author MatthewSheldon
 */
public class Beginning {
	/**
	 * Prints the beginning of the HTML file including...
	 * 	-The document type
	 * 	-The language
	 * 	-The Style sheet
	 * @param out	The HTML file that we are currently printing to
	 * @author MatthewSheldon
	 */
	public void printBeginingOfHTMFile(PrintWriter out) {
		out.println("<!DOCTYPE html>");
		out.println("<html lang=\"en\">");
		out.println("");
		
		// Generate the code for the Style Sheet (same regardless of information type)
		printStyleSheetToHTMLFile(out);
		
		out.println("</head>");
	}
	
	/**
	 * Prints the StyleSheet to the HTML File
	 * This should not be any different even if this is a different type of content
	 * @param out	The HTML file that we are currently printing to
	 * @author MatthewSheldon
	 */
	private void printStyleSheetToHTMLFile(PrintWriter out) {
		out.println("<!-- This is the styling of the page -->");
		out.println("<head>");
		out.println("\t<title>Hawk Fest 2021</title>");
		out.println("\t<meta charset=\"utf-8\">");
		out.println("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
		out.println("\t<style>");
		out.println("\t\t* {");
		out.println("\t\t\tmargin: 0 auto;");
		out.println("\t\t\tpadding: 0;");
		out.println("\t\t\tbox-sizing: border-box;");
		out.println("\t\t}");
		out.println("");
		out.println("\t\t@font-face {");
		out.println("\t\t\tfont-family: 'LeavesAndGround';");
		out.println("\t\t\tsrc: url('Fonts/LeavesAndGround.woff2') format('woff2'),");
		out.println("\t\t\t\turl('Fonts/LeavesAndGround.woff') format('woff'),");
		out.println("\t\t\t\turl('Fonts/LeavesAndGround.ttf') format('truetype'),");
		out.println("\t\t\t\turl('Fonts/LeavesAndGround.svg#LeavesAndGround') format('svg');");
		out.println("\t\t\tfont-weight: lighter;");
		out.println("\t\t\tfont-style: normal;");
		out.println("\t\t\tfont-display: swap;");
		out.println("\t\t}");
		out.println("");
		out.println("\t\t/* Style the header */");
		out.println("\t\theader {");
		out.println("\t\t\tbackground-color: black;");
		out.println("\t\t\tdisplay: block;");
		out.println("\t\t\ttext-align: center;");
		out.println("\t\t\tfont-size: 5vmin;");
		out.println("\t\t\tcolor: white;");
		out.println("\t\t\theight: 10vh;");
		out.println("\t\t\tline-height: 10vh;");
		out.println("\t\t\tmargin: 0;");
		out.println("\t\t}");
		out.println("");
		out.println("\t\t/* Style to add the flags surrounding the name of the coutnry */");
		out.println("\t\theader h2 img {");
		out.println("\t\t\theight: 5vmin;");
		out.println("\t\t\twidth: auto;");
		out.println("\t\t}");
		out.println("");
		out.println("\t\t/* Create two columns/boxes that floats next to each other */");
		out.println("\t\tnav {");
		out.println("\t\t\tfloat: left;");
		out.println("\t\t\ttext-align: center;");
		out.println("\t\t\twidth: 30%;");
		out.println("\t\t\theight: 85vh;");
		out.println("\t\t\tbackground: #718ef5;");
		out.println("\t\t}");
		out.println("");
		out.println("\t\t/* Styling for the buttons */");
		out.println("\t\ta {");
		out.println("\t\t\tbackground-color: #222e99;");
		out.println("\t\t\ttext-align: center;");
		out.println("\t\t\tdisplay: block;");
		out.println("\t\t\tcolor: white;");
		out.println("\t\t\tbox-sizing: border-box;");
		out.println("\t\t\tborder: solid #22255a 0.5vmin;");
		out.println("\t\t\tfont-size: 4vmin;");
		out.println("\t\t\tmargin-bottom: 6vmin;");
		out.println("\t\t\ttext-decoration: none;");
		out.println("\t\t}");
		out.println("");
		out.println("\t\t/* Changes to the buttons when hovering over */");
		out.println("\t\ta:hover {");
		out.println("\t\t\tbackground-color: #22255a;");
		out.println("\t\t\tcursor: pointer;");
		out.println("\t\t}");
		out.println("");
		out.println("\t\t/* Styling for the HawkFest Logo */");
		out.println("\t\ta img {");
		out.println("\t\t\tdisplay: block;");
		out.println("\t\t\tfont-size: 3vmin;");
		out.println("\t\t\twidth: 10vmin;");
		out.println("\t\t\theight: auto;");
		out.println("\t\t\ttext-align: center;");
		out.println("\t\t}");
		out.println("");
		out.println("\t\t/* Style the list inside the menu */");
		out.println("\t\tnav ul {");
		out.println("\t\t\tlist-style-type: none;");
		out.println("\t\t\ttext-align: justify;");
		out.println("\t\t}");
		out.println("");
		out.println("\t\t/* This is the style for the article section where most ");
		out.println("\t\t\tof the content for a given country will be located */");
		out.println("\t\tarticle {");
		out.println("\t\t\tfont-family: Arial, Helvetica, sans-serif;");
		out.println("\t\t\tbackground-color: #f1f1f1;");
		out.println("\t\t\tfloat: left;");
		out.println("\t\t\tpadding: 10px;");
		out.println("\t\t\twidth: 70%;");
		out.println("\t\t\theight: 85vh;");
		out.println("\t\t\tfont-size: 2.5vmin;");
		out.println("\t\t\toverflow-y: auto;");
		out.println("\t\t}");
		out.println("");
		out.println("\t\t/* This will make the images respective to the screen size */");
		out.println("\t\tarticle img {");
		out.println("\t\t\twidth: 50vmin;");
		out.println("\t\t\theight: auto;");
		out.println("\t\t}");
		out.println("");
		out.println("\t\t/* This will make the videos respective to the screen size */");
		out.println("\t\tarticle video {");
		out.println("\t\t\twidth: 50vmin !important;");
		out.println("\t\t\theight: auto !important;");
		out.println("\t\t}");
		out.println("");
		out.println("\t\t/* Clear floats after the columns */");
		out.println("\t\tsection::after {");
		out.println("\t\t\tcontent: \"\";");
		out.println("\t\t\tdisplay: table;");
		out.println("\t\t\tclear: both;");
		out.println("\t\t}");
		out.println("");
		out.println("\t\t/* Style the footer */ ");
		out.println("\t\tfooter {");
		out.println("\t\t\tbackground-color: #22255a;");
		out.println("\t\t\tfont-size: 5vmin;");
		out.println("\t\t\ttext-align: center;");
		out.println("\t\t\tcolor: white;");
		out.println("\t\t\theight: 5vh;");
		out.println("\t\t\tline-height: 5vh;");
		out.println("\t\t}");
		out.println("\t</style>");
	}
}
