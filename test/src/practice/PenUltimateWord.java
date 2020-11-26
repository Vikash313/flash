package practice;

import java.util.Scanner;

public class PenUltimateWord {

	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a Sentence: ");
		String line = input.nextLine();
		
		String[ ] words = line.split("[ ]+");
		System.out.println("Penultimate word is: "+words[words.length - 2]);


	}

}
