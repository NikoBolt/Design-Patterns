package com.company._6_IO_Decorator;

//import java.io.*;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
	public static void main(String[] args) throws IOException {
		int c;
		InputStream in = null;
		try {
			in =
				new LowerCaseInputStream(
					new BufferedInputStream(
						new FileInputStream("src/com/company/_6_IO_Decorator/test.txt")));

			while((c = in.read()) >= 0) {
				System.out.print((char)c);
			}

//			in.close();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (in != null) { in.close(); }
		}

		System.out.println();

		// трай с ресурсом
		try (InputStream in2 =
				new LowerCaseInputStream(
					new BufferedInputStream(
						new FileInputStream("src/com/company/_6_IO_Decorator/test.txt"))))
		{
			while((c = in2.read()) >= 0) {
				System.out.print((char)c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
