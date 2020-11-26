package Basicpart2;

import java.util.Scanner;

public class Exercise163 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = in.nextInt();
		int[] bin_num = new int[100];
		int i = 0;
		int ctr = 0;
		
		while(num != 0) {
			bin_num[i++] = num % 2;
			num = num / 2;
			}
		System.out.println("Binary number is: ");
		for(int  j = i-1; j > -1; j--) { 
			System.out.println(bin_num[j]);
				
			if(bin_num[j] == 0)
				ctr++;
	}
		
		System.out.println("\nNumber of zero bits:"+ctr);
		
	}

}
