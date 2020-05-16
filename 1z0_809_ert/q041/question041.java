package com.wealth.certificate.dumps_1z0_809_ert.question041;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class question041 {
	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream(getCurrentPath() + "/version.txt");
				InputStreamReader isr = new InputStreamReader(fis);
				BufferedReader br = new BufferedReader(isr);) { //defaultCharBufferSize = 8192
			if (br.markSupported()) {
				System.out.print((char) br.read());
				br.mark(2);
				System.out.print((char) br.read());
				br.reset();
				System.out.print((char) br.read());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String getCurrentPath() {
		return System.getProperty("user.dir") + "/src/main/java/com/wealth/certificate/dumps_1z0_809_ert/question041";
	}
}

/*
What is the result?
A) The program prints nothing. 
B) 122
C) 135
D) 121

Answer: B

The mark and reset methods of streams provide a way to jump backwards in the stream and re-read data.

mark(int readAheadLimit) = Marks the current position in this input stream.

	readAheadLimit = Limit on the number of characters that may be read 
	while still preserving the mark. An attempt to reset the stream 
	after reading characters up to this limit or beyond may fail. 
	A limit value larger than the size of the input buffer will cause a new buffer to be allocated 
	whose size is no smaller than limit. Therefore large values should be used with care.
reset() = Resets the stream to the most recent mark.

https://stackoverflow.com/questions/8240071/what-are-mark-and-reset-in-bufferedreader

if you run reset() before mark(), it will throw "java.io.IOException: Stream not marked"

Support Mark
- BufferedReader
- BufferedInputStream

*/