
package com.service;

/**
 * @author HanumanL
 *
 */
public class CheckCharacters {
	public static int checkCharactersValue(String string) {
		int length = string.length();
		if (string.charAt(0) == (string.charAt(length - 1))) {
			return 1;
		}
		return -1;
	}
}
