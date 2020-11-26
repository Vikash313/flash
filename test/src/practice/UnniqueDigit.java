package practice;

import java.util.Scanner;

public class UnniqueDigit {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter four Digit numbers: ");
		int num = input.nextInt();
		
		int amount = 0;
		
		for(int i = 1; i<=4; i++) {
			for(int j = 1; j<=4; j++) {
				for(int k = 1; k<=4; k++) {
					if(k != i && k != j && i != j) {
						amount ++;
						System.out.println(i+ "" + j + "" +k);
					}
				}
			}
		}
		System.out.println("Total number of three-digit-number is: "+amount);

	}

}
