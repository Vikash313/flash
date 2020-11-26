package practice;

import java.util.Scanner;

public class CountLetterSpaceNumberOth {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a String");
		char[] s = input.nextLine().toCharArray();
		
		int letter = 0;
		int num = 0;
		int space = 0;
		int other = 0;
		
		for(int i = 0; i<=s.length-1;i++){
			if(Character.isLetter(s[i])) {
				letter ++;
			}
			else if(Character.isDigit(s[i])){
				num ++;
			}
			else if(Character.isSpaceChar(s[i])) {
				space ++;
			}
			else {
				other ++;
			}
			
		}
		
		System.out.println("Letter: "+letter);
		System.out.println("Number: "+num);
		System.out.println("Space: "+space);
		System.out.println("Other: "+other);
		

	}

}
