package practice;

import java.util.Arrays;

public class Exercise95 {

	public static void main(String[] args) {
		 int n = 5;
		 String[] String_array = new String[n];
		 
		 for(int i= 0; i<n;i++) {
			 String_array[i] = String.valueOf(i);
		 }
		 System.out.println("New Array is: "+Arrays.toString(String_array));

	}

}
