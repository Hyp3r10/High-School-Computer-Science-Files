import static java.lang.System.*;

public class AtCounter
{
   private char[][] atMat;

	public AtCounter()
	{
		atMat = new char[][]{{'@','-','@','-','-','@','-','@','@','@'},
							 {'@','@','@','-','@','@','-','@','-','@'},
							 {'-','-','-','-','-','-','-','@','@','@'},
							 {'-','@','@','@','@','@','-','@','-','@'},
							 {'-','@','-','@','-','@','-','@','-','@'},
							 {'@','@','@','@','@','@','-','@','@','@'},
							 {'-','@','-','@','-','@','-','-','-','@'},
							 {'-','@','@','@','-','@','-','-','-','-'},
							 {'-','@','-','@','-','@','-','@','@','@'},
							 {'-','@','@','@','@','@','-','@','@','@'}};
	}

	public int countAts(int r, int c)
	{
		//add in recursive code to count up the # of @s connected
		//add in recursive code to count up the # of @s connected
		//start checking at spot [r,c]
		if((r > -1 && r < atMat.length) && (c > -1 && c < atMat[r].length)) {
			if(atMat[r][c] == '@') {
				atMat[r][c] = '1';
				return 1 + countAts(r-1, c) + countAts(r, c-1) + countAts(r+1, c) + countAts(r, c+1);
			}
			else {
				return 0;
			}
		}
		else {
			return 0;
		}
	}
	/*
	 *this method will return all values in the matrix
	 *this method should return a view of the matrix
	 *that looks like a matrix
	 */
	public String toString()
	{
		String temp = "";
		for(char[] temp1 : atMat) {
			for(char temp2 : temp1) {
				if(temp2 == '1') {
					temp2 = '@';
				}
				temp+=temp2 + " ";
			}
			temp+="\n";
		}
		return temp;
	}
}