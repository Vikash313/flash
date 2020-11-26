package practice;

import java.util.Arrays;

public class Exercise98 {

	public static void main(String[] args) {
		int count = 0, result = 0;
		
		int[] array_nums = {10,20,10,20,40,13,20};
		
		 if(array_nums.length > 1 && array_nums[0] == 20) {
			 count++;
		 }
		 
		 for(int i = 1; i < array_nums.length; i++) {
			 if(array_nums[i-1] == 20 && array_nums[i] == 20) {
				 System.out.println(String.valueOf(false));
				 result = 1;
			 }
			 if(array_nums[i] == 20)
				 count++;
		 }
		 
		 if(result == 0) {
			 System.out.println(String.valueOf(count == 3));
		 }
			 

	}

}
