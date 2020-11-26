package practice;

import java.util.Arrays;

public class Exercise79 {

	public static void main(String[] args) {
		 
		int[] original_array = {20,30,40};
		System.out.println("Originanl Array: "+Arrays.toString(original_array));
		
		int[] new_array = {original_array[2], original_array[1], original_array[0]};
		System.out.println("Rotated Array: "+Arrays.toString(new_array));
		
		int max_val = original_array[0];
		if(original_array[2] >= max_val)
		max_val = original_array[2];{
			System.out.println("Larger value between first and last is: "+max_val);
		}
		

	}

}
