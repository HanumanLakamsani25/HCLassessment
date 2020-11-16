
package com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author HanumanL
 *
 */
public class MainBufferReader {

	public static void main(String[] args) {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name :");
		String name;
		try {
			name = bufferedReader.readLine();
			System.out.println("Hello " + name + " !");
		} catch (IOException e) {
			System.err.println(e);
		} finally {
			bufferedReader = null;
			name = null;
		}
	}

}
