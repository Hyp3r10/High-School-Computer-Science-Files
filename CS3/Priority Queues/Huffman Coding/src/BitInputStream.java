//The BitOutputStream and BitInputStream classes provide the ability to
//write and read individual bits to a file in a compact form.  One major
//limitation of this approach is that the resulting file will always have
//a number of bits that is a multiple of 8.  In effect, whatever bits are
//output to the file are padded at the end with 0's to make the total
//number of bits a multiple of 8.
//
//BitInputStream has the following public methods:
//  public BitInputStream(String file)
//      opens an input stream with the given file name
//  public int readBit()
//      reads the next bit from input (-1 if at end of file)
//  public void close()
//      closes the input

import java.io.*;

public class BitInputStream {
	private FileInputStream input;
	private int digits;     // next set of digits (buffer)
	private int numDigits;  // how many digits from buffer have been used

	private static final int BYTE_SIZE = 8;  // digits per byte
	// pre : given file name is legal
	// post: creates a BitInputStream reading input from the file
	public BitInputStream(String file) {
		try {
			input = new FileInputStream(file);
		} catch (IOException e) {
			throw new RuntimeException(e.toString());
		}
		nextByte(); //grab the next 8 bits from the file
	}

	// post: reads next bit from input (-1 if at end of file)
	public int readBit() {
		// if at eof, return -1
		if (digits == -1)
			return -1;
		int result = digits % 2;
		digits /= 2;
		numDigits++;
		if (numDigits == BYTE_SIZE)
			nextByte();
		return result;
	}

	// post: refreshes the internal buffer with the next BYTE_SIZE bits
	private void nextByte() {
		try {
			digits = input.read();
		} catch (IOException e) {
			throw new RuntimeException(e.toString());
		}
		numDigits = 0;
	}

	// post: input is closed
	public void close() {
		try {
			input.close();
		} catch (IOException e) {
			throw new RuntimeException(e.toString());
		}
	}

	// included to ensure that the stream is closed
	protected void finalize() {
		close();
	}
}