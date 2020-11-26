package practice;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		
		int dec_num, i = 0, quot;
		int[] bin_num = new int[100];
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Decimal number: ");
		dec_num = scan.nextInt();
		
		quot = dec_num;
		while(quot != 0) 
		{
			bin_num[i++] = quot%2;
			quot = quot/2;
			
		}
		System.out.println("Binary number is: ");
		for(int j = i-1; j>-1; j--)
		{
			System.out.println(bin_num[j]);
		}

	}

}
