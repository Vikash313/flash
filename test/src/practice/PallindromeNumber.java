package practice;

import java.util.Scanner;

public class PallindromeNumber {

	public static void main(String[] args) {
		
		 Scanner in = new Scanner(System.in);
		 
		 System.out.println("Enter a number : ");
		 int num = in.nextInt();
		 
		 int rem = 0;
		 int rev = 0;
		 int temp = num;
		 
		 while(temp != 0) {
			 rem = temp % 10;
		     rev = rev*10 + rem;
		     temp = temp /10;
		 }
		 
		 if(num == rev ) {
			 System.out.println(num+" is Pallindrome number");
		 }
		 else {
			 System.out.println(num+" is not a Pallindrome number");
		 }
			 

	}

}
