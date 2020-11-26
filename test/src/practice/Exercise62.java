package practice;

import java.util.Scanner;

public class Exercise62 {

	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the first number: ");
        int a = input.nextInt();
        
        System.out.println("Enter the second number: ");
        int b = input.nextInt();
        
        System.out.println("Enter the third number: ");
        int c = input.nextInt();
        
        if(a>=20 || b>=20 || c>=20) {
        	if((a-b)>=20 || (b-c)>=20 || (c-a)>=20) {
        		System.out.println("true");
        	}
        	else 
        		System.out.println("false");
        	}
        	else 
        		System.out.println("false");
        	
        }

	}

