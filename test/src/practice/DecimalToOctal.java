package practice;

import java.util.Scanner;

public class DecimalToOctal {

	public static void main(String[] args) {
		
		int dec_num, quot, rem, i = 1, j;
		int oct_num[] = new int[100];
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a Decimal nummber: ");
		dec_num = scan.nextInt();
		
		quot = dec_num;
		
		while(quot != 0)
		{
			oct_num[i++] = quot % 8;
			quot = quot / 8;
		}
		
		System.out.println("Octal number is: ");
		for(j = i-1; j > 0; j--)
		{
			System.out.println(oct_num[j]);
		}
		System.out.println("\n");

		
		
	}

}
