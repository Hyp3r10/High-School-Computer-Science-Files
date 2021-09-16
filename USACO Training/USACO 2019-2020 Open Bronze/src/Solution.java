import static java.lang.System.out;

import java.util.Arrays;
public class Solution {
	public static void main(String[] args) {
		int[] list = {8,10,6,28,25,18};
		char[] ray = new char[6];
		for(int i = 0; i<list.length; i++)
		 ray[i]=(char)('A' + list[i]);
		out.println(ray[2]); //line 1
		Arrays.sort(ray);
		System.out.println(ray); // line 2
	}
	


}