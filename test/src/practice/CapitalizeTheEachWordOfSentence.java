package practice;
import java.util.Scanner;

public class CapitalizeTheEachWordOfSentence {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a sentence: ");
		String line = input.nextLine();
		
		String upper_case_line = "";
		Scanner lineScan = new Scanner(line);
		while(lineScan.hasNext()) {
			String word = lineScan.next();
			upper_case_line += Character.toUpperCase(word.charAt(0)) + word.substring(1) +" ";
		}
		System.out.println(upper_case_line.trim());

	}

}
