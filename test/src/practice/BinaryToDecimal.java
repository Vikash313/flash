package practice;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		
		long bin_num, dec_num = 0, i = 1, remainder;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a Binary number: ");
		bin_num = scan.nextLong();
		
		while(bin_num != 0)
		{
			remainder = bin_num % 10;
			dec_num = dec_num + remainder * i;
			i = i * 2;
			bin_num = bin_num / 10;
		}
		
		System.out.println("Decimal number is: "+dec_num);
		

	}

}
