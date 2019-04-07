package com.javaBasic;

public class ReverseString {

	public static void main(String[] args) {
		String input = "My Name is Sachin";
		String output = reverse(input);
		System.out.println(output);
	}
	private static String reverse(String input) {
		String reverse = "";
		if(input.isEmpty() || input == null ) {
			System.out.println("the input should not be empty");
		}
		if(input.length()<=1) {
			reverse = input;
		}else {
			String[] originalArray = input.split("\\s");
			for(String item: originalArray) {
				reverse = item + " " + reverse;
			}
		}
		return reverse.trim();
		
	}


}
