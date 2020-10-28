import java.util.Arrays;

public class Part implements Comparable<Part> {
	private String make = "", model = "";
	private int year = 0;

	public Part(String line) {
		String[] list = line.split(" ");
		int i = 0;
		String temp = list[0];
		while(!temp.matches("\\d*")) {
			this.model += temp + " ";
			temp = list[++i];
		}
		this.model += temp;
		temp = list[++i];
		while(!temp.matches("\\d*")) {
			this.make += temp + " ";
			temp = list[++i];
		}
		this.year = Integer.parseInt(temp);
	}

	//have to have compareTo if implements Comparable
	public int compareTo( Part rhs ) {
		if(this.make.compareTo(rhs.make) < 0) {
			return -1;
		} 
		else if(this.make.compareTo(rhs.make) > 0) {
			return 1;
		}
		else {
			if(this.model.compareTo(rhs.model) < 0) {
				return -1;
			}
			else if(this.model.compareTo(rhs.model) > 0) {
				return 1;
			}
			else {
				if(this.year < rhs.year) {
					return -1;
				}
				else if(this.year > rhs.year){
					return 1;
				}
				else {
					return 0;
				}
			}
		}
	}

	public String toString() {
		return this.make + this.year + "  " + this.model;
	}
}