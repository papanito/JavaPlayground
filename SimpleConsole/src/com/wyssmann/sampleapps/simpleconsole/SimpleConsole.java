/**
 * 
 */
package com.wyssmann.sampleapps.simpleconsole;

import java.util.Scanner;

/**
 * @author wyssmana
 *
 */
public class SimpleConsole {
	private static String EXIT = "exit";
	private static String UNKNOWN = "unknown";
	
	public SimpleConsole() {
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s;
		Scanner reader = new Scanner(System.in);
		while (true) {
			System.out.print(">");
			s = reader.next();
			String command = parse_input(s);
			if (command.equals(EXIT)) {
				break;
			} else {
				System.out.println("'"+command+"' unknown");
			}

		}
		reader.close();
	    System.out.println("You are done, have a nice day!");
	}
	
	/**
	 * @param input Arbitrary input string
	 * @return 	command which user entered (ignoring all attributes)
	 */
	public static String parse_input(String input) {
		String[] arguments = input.split(" ");
		return arguments[0];
	}
}