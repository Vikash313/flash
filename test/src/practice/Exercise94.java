package practice;

import java.util.Arrays;

public class Exercise94 {

	public static void main(String[] args) {
		int i=0; 
		int temp = 0;
		int[] nums = {1,7,8,5,7,13,2,4,9};
		System.out.println("Original Array is: "+Arrays.toString(nums));
		
		while( i < nums.length && nums[i] % 2 == 0)
			i++;
		for(int j = i + 1; j<nums.length; j++) {
			if(nums[j] % 2 != 0) {
			    temp = nums[i];
			    nums[i] = nums[j];
			    nums[j] = temp;
			    i++;
		}
		}
	
        System.out.println("New Array: "+Arrays.toString(nums));
}
}

