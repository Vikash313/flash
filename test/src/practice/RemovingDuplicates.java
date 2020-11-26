package practice;

import java.util.Arrays;

public class RemovingDuplicates {

	public static void main(String[] args) {
		
		int[] nums = {1,1,2,3,3,3,4,5,6,7,7};
		System.out.println("Original Array is: "+Arrays.toString(nums));
		System.out.println("Original length is: "+nums.length);
		System.out.println("Aftetr removing the duplicates new length of Array is: "+removeDuplicates(nums));
	}
		
		public static int removeDuplicates(int[] nums) {
		int j = 1;
		for(int i = 0; i < nums.length - 1; i++) {
			if(nums[i] != nums[i + 1])
				nums[j++] = nums[i];		
		}
		return j;

	}
}
