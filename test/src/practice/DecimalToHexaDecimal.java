package practice;

import java.util.Scanner;

public class DecimalToHexaDecimal {

	public static void main(String[] args) {
		
		int dec_num, rem;
		String hexdec_num = "";
		
		char hex[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Decimal Number:");
		dec_num = scan.nextInt();
		
		while(dec_num > 0)
		{
		  rem = dec_num%16;
		  hexdec_num = hex[rem] + hexdec_num;
		  dec_num = dec_num/16;
		}
		System.out.println("Hexadecimal number is: "+hexdec_num);

	}

}
