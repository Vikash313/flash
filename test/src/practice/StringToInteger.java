package practice;

import java.util.Scanner;

public class StringToInteger {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number(string): ");
		String str = in.nextLine();
		int result = Integer.parseInt(str);
		System.out.printf("The integer value is: %d",result);

	}

}
