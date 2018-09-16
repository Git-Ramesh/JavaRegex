package com.rs.regex.app;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhone {
	public static void main(String[] args) {
		boolean isValidPhone = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter phone number to validate: ");
		String phone = sc.nextLine();
		System.out.println("Input number: " + phone);
		String regEx = "(0|91)?[7-9][0-9]{9}";
		Pattern pattern = Pattern.compile(regEx);
		Matcher matcher = pattern.matcher(phone);
		if (matcher.find() && matcher.group().equals(phone)) {
			isValidPhone = true;
		}
		System.out.println("Validation Result: " + isValidPhone);
	}
}
