package practice;

import java.util.Arrays;

public class Exercise107 {

	public static void main(String[] args) {
		
		int[] array_nums = {11,12,13,14,45,20};
		
		System.out.println("Originanl Array: "+Arrays.toString(array_nums));
		int result = 0;
		  
		for(int i = 0; i<=array_nums.length-3; i++) {
			if(array_nums[i] + 1 == array_nums[i+1] && array_nums[i+1] + 1 == array_nums[i+2])
				result = 1;
		}
			if(result == 0) {
				System.out.println(String.valueOf(false));
				}
			else {
				System.out.println(String.valueOf(true));
			}
				

	}

}
