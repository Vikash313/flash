package practice;

import java.util.Scanner;

public class Exercise110 {

	public static void main(String[] args) {
		 
        Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a positive number: ");
		int n = in.nextInt();
		int ctr = 0;
		boolean testd = false;
		
		while(n != 1) {
			if(n % 4 != 0)
			n= n/4;
			testd = true;
			ctr++;
		}
		if(testd == true) {
		System.out.println(String.valueOf(true));
		}
		if(ctr == 0) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
			


	}

}
