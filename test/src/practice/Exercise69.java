package practice;

import java.util.Scanner;

public class Exercise69 {

	public static void main(String[] args) {
		
		 Scanner in = new Scanner(System.in);
		 
		 System.out.println("Enter thr string: ");
		 String main_string = in.nextLine();
		 
            
         //String main_string = "Python";
         System.out.println(main_string.substring(0, main_string.length()/2));

	}

}
