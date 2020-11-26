package practice;

import java.util.Arrays;

public class Exercise103 {

	public static void main(String[] args) {
		
		int[] array_nums = {11,10,13,10,45,20,33,53};
		System.out.println("Original Array: "+Arrays.toString(array_nums));
		
		int[] new_array;
		int l = array_nums.length-1;
		
		while(array_nums[l] != 10)
			l--;
		new_array = new int[array_nums.length-1-l];
		for(int i = l + 1; i < array_nums.length; i++) {
			new_array[i-l-1] = array_nums[i];		
		}
		System.out.println("New Array: "+Arrays.toString(new_array));

	}

}
