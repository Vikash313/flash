package practice;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insert a String: ");
		String letters = input.nextLine();
		
		int len = letters.length();
		String rev = "";
		
		for(int i = len - 1; i>=0; i--)
		{
			rev = rev + letters.charAt(i);
		}
		
		System.out.println("Reverse of String is: "+rev);

	}

}
