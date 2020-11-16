
package com.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * 
 * @author HanumanL
 *
 */
public class MainText {
	public static void main(String[] args) {

		try {
			FileWriter fileWriter = new FileWriter("text.txt");
			String msg = "HCL Technologies,Chennai";
			fileWriter.write(msg);
			fileWriter.close();
			FileReader fileReader = new FileReader("text.txt");
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			int data;
			while ((data = bufferedReader.read()) != -1) {
				System.out.print((char) data);
			}

			bufferedReader.close();
			fileReader.close();

		} catch (IOException e) {
			System.err.println(e);
		}

	}

}
