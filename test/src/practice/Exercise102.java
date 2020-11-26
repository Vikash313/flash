package practice;

import java.util.Arrays;

public class Exercise102 {

	public static void main(String[] args) {
		
		int[] array_nums = {11,11,13,31,45,20,33,53};
		System.out.println("Array is: "+Arrays.toString(array_nums));
		int ctr = 0;
		
		for(int i = 0; i < array_nums.length; i++) {
			if(array_nums[i] == 10 || array_nums[i] == 30 )
				ctr++;
		}
		if(ctr==0) {
		System.out.println(String.valueOf(false));
		}
		else 
			System.out.println(String.valueOf(true));

	}

}
