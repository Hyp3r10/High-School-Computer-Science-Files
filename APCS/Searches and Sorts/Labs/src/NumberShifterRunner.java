import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifterRunner
{
	public static void main( String args[] ) throws IOException
	{
		//add test cases
		for(int i = 0; i < 3; i++) {
			int[] nums = NumberShifter.makeLucky7Array(20);
			NumberShifter.shiftEm(nums);
		}
	}
}


