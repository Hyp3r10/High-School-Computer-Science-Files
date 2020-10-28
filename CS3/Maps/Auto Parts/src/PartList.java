import static java.lang.System.out;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;

public class PartList
{
	private TreeMap<Part, Integer> partsMap;

	public PartList() {
		this.partsMap = new TreeMap<Part, Integer>();
	}

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

	public String toString() {
		String output="";
		for(Part temp : this.partsMap.keySet()) {
			output += temp.toString() + " - " + this.partsMap.get(temp) + "\n";
		}
		return output;
	}
}