package com.rs.regex.app;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {
	public static void main(String[] args) {
		boolean isValidEmail = false;
		Scanner scanner = new Scanner(System.in);
		String regex = "[a-zA-Z0-9][a-zA-Z0-9._]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+";
		System.out.println("Enter email to validate: ");
		String email = scanner.nextLine();
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		if (matcher.find() && matcher.group().equals(email)) {
			isValidEmail = true;
		}
		System.out.println("Is valid email? " + isValidEmail);
	}
}
