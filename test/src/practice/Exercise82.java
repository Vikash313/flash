package practice;

import java.util.Arrays;

public class Exercise82 {

	public static void main(String[] args) {
		
		int[] o_array = {20,30,4,50,17};
		System.out.println("Original_array is: "+Arrays.toString(o_array));
		
		int max_val = o_array[0];
		
		if(max_val <= o_array[o_array.length-1]) 
			max_val = o_array[o_array.length-1];
		if(max_val <= o_array[o_array.length / 2])
			max_val = o_array[o_array.length / 2];
		System.out.println("Largest value between first last and middle number is: "+max_val);
			
		}

	}


