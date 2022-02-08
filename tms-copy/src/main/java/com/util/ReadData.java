package com.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadData {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	/**
	 * getStringValue() will take the from the console. 
	 * @param strInput
	 * @return String 
	 * @throws IOException
	 */
	public static String getStringValue(String strInput) throws IOException {
		System.out.print("Enter " + strInput);
		return br.readLine();
	}
	/**
	 * getIntegerValue() takes the user input and parse the input into Double datatype.
	 * @param intInput
	 * 
	 */
	public static Integer getIntegerValue(String intInput){
		System.out.print("Enter " + intInput);
		int value = 0;
		try {
			value = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			System.out.println("Please enter anyone of the given numbers as input.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}
	
	/**
	 * getDoubleValue() takes the user input and parse the input into Double datatype.
	 * @param doubleInput
	 * 
	 */
	public static Double getDoubleValue(String doubleInput)  {
		System.out.print("Enter " + doubleInput);
		double value = 0;
		try {
			value = Double.parseDouble(br.readLine());
		} catch (NumberFormatException e) {
			System.out.println("Please enter anyone of the given numbers as input.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}
	
	
}
