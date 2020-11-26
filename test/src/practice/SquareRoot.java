package practice;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = in.nextInt();
		
		double temp;
		double sr = num/2;
		 do {
			 temp = sr;
			 sr = (temp + (num/temp))/2;
		 }while((temp - sr)!= 0);
		 
		 System.out.println("Square root of a number is "+sr);

	}

}
