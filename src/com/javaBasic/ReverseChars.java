package com.javaBasic;

import java.util.Scanner;

public class ReverseChars {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter String : ");
		String original = scanner.nextLine();
		
		while(original.isEmpty() || original == null ) {
			System.out.println("enter valid string");
			original = scanner.nextLine();
		}
		scanner.close();
		
		ReverseChars output = new ReverseChars();
		String reverseCharacters = output.reverseCharacters(original);
		System.out.println(reverseCharacters);
	}
	private String reverseCharacters(String originalString) {
		String reverse = "";
		for(int i = originalString.length() -1; i >=0; i-- ) {
			reverse = reverse + originalString.charAt(i);
		}
		return reverse;
	}


}
