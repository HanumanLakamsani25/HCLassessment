/**
 * 
 */
package com.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * 
 * @author HanumanL
 *
 */
public class MainAppendText {

	public static void main(String[] args) {
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader("text.txt"));
			int data;
			System.out.println("Print data from the existing file");
			while ((data = bufferedReader.read()) != -1) {
				System.out.print((char) data);
			}
			BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("\nEnter the message to be appended into the file :");
			String msg = bufferedReader2.readLine();
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("text.txt", true));
			bufferedWriter.append(msg);
			bufferedWriter.close();
			System.out.println("\nPrinting the data after appending in the existing file");
			BufferedReader bufferedReader3 = new BufferedReader(new FileReader("text.txt"));
			while ((data = bufferedReader3.read()) != -1) {
				System.out.print((char) data);
			}
			bufferedReader.close();
			bufferedReader2.close();
			bufferedReader3.close();
		} catch (FileNotFoundException e) {
			System.err.println(e);
		} catch (IOException e) {
			System.err.println(e);
		}
	}

}
