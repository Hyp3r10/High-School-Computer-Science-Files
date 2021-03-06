import static java.lang.System.out;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;

public class PartList {
	private TreeMap<Part, Integer> partsMap;	// Map that references the number of each part needed 
	/**
	 * Default constructor used to instantiate a blank map for partsMap
	 */
	public PartList() {
		this.partsMap = new TreeMap<Part, Integer>();
	}
	/**
	 * Takes the file name and creates the partsMap to reflect the order being requested
	 * @param fileName	The name of the file being read in
	 */
	public PartList(String fileName) {
		this();
		try {
			Scanner scan = new Scanner(new File(fileName));
			ArrayList<Part> parts = new ArrayList<Part>();
			while(scan.hasNextLine()) {
				parts.add(new Part(scan.nextLine()));
			}
			Collections.sort(parts);
			for(int i = 0; i < parts.size(); i++) {
				int numParts = 0;
				if(this.partsMap.containsKey(parts.get(i))) {
					numParts = partsMap.get(parts.get(i));
				}
				partsMap.put(parts.get(i), numParts+1);
			}
		}
		catch( IOException e ) {
			out.println(e);
		} catch( RuntimeException e ) {
			out.println(e);
		} catch( Exception e ) {
			out.println(e);
		}
	}
	@Override
	public String toString() {
		String output="";
		for(Part temp : this.partsMap.keySet()) {
			output += temp.toString() + " - " + this.partsMap.get(temp) + "\n";
		}
		return output;
	}
}