package com.rs.regex.app;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sample1 {

	public static void main(String[] args) {
		int count = 0;
		String regEx = "ab";
		Pattern pattern = Pattern.compile(regEx);
		Matcher matcher = pattern.matcher("abbabbba");
		while (matcher.find()) {
			++count;
			System.out.println(matcher.start() + " ----- " + matcher.end() + " ---- " + matcher.group());
		}
		System.out.println("Matches found: " + count);
	}

}
