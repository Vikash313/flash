package practice;

import java.util.Scanner;

public class LowerCase {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a Sentence: ");
		String line = input.nextLine();
		
		line = line.toLowerCase();
		System.out.println(line);

	}

}
