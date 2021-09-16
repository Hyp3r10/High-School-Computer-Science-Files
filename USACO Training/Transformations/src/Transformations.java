/*
ID: punchwo1
LANG: JAVA
PROG: transform
*/

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

class transform {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File("transform.in"));
		PrintWriter out = new PrintWriter(new File("transform.out"));
		int size = scan.nextInt(); scan.nextLine();
		String[][] startArr = new String[size][size];
		String[][] endArr = new String[size][size];
		for(int i = 0; i < size; i++) {
			startArr[i] = scan.nextLine().split("");
		}
		for(int i = 0; i < size; i++) {
			endArr[i] = scan.nextLine().split("");
		}
		Transformation start = new Transformation(startArr);
		Transformation end = new Transformation(endArr);
		out.println(isTransformable(start, end));
		out.close();
	}
	public static int isTransformable(Transformation start, Transformation end) {
		Transformation rot90 = start.rotate90();
		if(rot90.equals(end)) {
			return 1;
		}
		Transformation rot180 = start.rotate180();
		if(rot180.equals(end)) {
			return 2;
		}
		Transformation rot270 = start.rotate270();
		if(rot270.equals(end)) {
			return 3;
		}
		Transformation reflect = start.reflect();
		if(reflect.equals(end)) {
			return 4;
		}
		Transformation reflect90 = reflect.rotate90();
		if(reflect90.equals(end)) {
			return 5;
		}
		Transformation reflect180 = reflect.rotate180();
		if(reflect180.equals(end)) {
			return 5;
		}
		Transformation reflect270 = reflect.rotate270();
		if(reflect270.equals(end)) {
			return 5;
		}
		if(start.equals(end)) {
			return  6;
		}
		return 7;
	}
}
class Transformation {
	public String[][] arr;
	public Transformation(String[][] arr) {
		this.arr = arr; 
	}
	public boolean equals(Transformation other) {
		for(int i = 0; i < this.arr.length; i++) {
			for(int j = 0; j < this.arr.length; j++) {
				if(!this.arr[i][j].equals(other.arr[i][j])) {
					return false;
				}
			}
		}
		return true;
	}
	public Transformation rotate90() {
		int size = arr.length;
		String[][] newArr = new String[size][size];
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				newArr[j][size-i-1] = arr[i][j];
			}
		}
		Transformation rot90 = new Transformation(newArr);
		return rot90;
	}
	public Transformation rotate180() {
		Transformation rot90 = this.rotate90();
		Transformation rot180 = rot90.rotate90();
		return rot180;
	}
	public Transformation rotate270() {
		Transformation rot180 = this.rotate180();
		Transformation rot270 = rot180.rotate90();
		return rot270;
	}
	public Transformation reflect() {
		int size = arr.length;
		String[][] newArr = new String[size][size];
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				newArr[i][size-j-1] = arr[i][j];
			}
		}
		Transformation reflect = new Transformation(newArr);
		return reflect;
	}
	@Override
	public String toString() {
		String output = "";
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				output+=arr[i][j];
			}
			output += "\n";
		}
		return output;
	}
} 
