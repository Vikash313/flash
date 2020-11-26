package practice;

import java.util.Scanner;

public class Execise116 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0)
				System.out.printf("\n%d: Fizz",i);
			if(i % 5 == 0)
				System.out.printf("\n%d: Buzz",i);
			if(i % 3 == 0 &&  i % 5 == 0)
				System.out.printf("\n%d: fizz buzz",i);
		}
		

	}
	
}
